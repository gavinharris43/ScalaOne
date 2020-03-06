package day5.RockPaperScissors

import day5.RockPaperScissors.RPSEnum.RPSEnum
import day5.RockPaperScissors.RPSWinEnum.RPSWinEnum

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import scala.util.Random

class RockPaperScissors(playerName: String) {
  val name = playerName.toUpperCase
  val previousPlayerGuesses = ArrayBuffer[RPSEnum]()
  val userStats = ArrayBuffer[RPSWinEnum]()

  def RockPaperScissors: Unit = {
    println(s"$name Your Win Percentage is $winStats")
    try {
      wonOutput(userWon(userGuess))
    } catch {
      case e: IllegalArgumentException =>
        println(s"IllegalStateException $e:  Application Restarting")
        RockPaperScissors

    }
    if (playAgain) {
      RockPaperScissors
    }
  }

  def playAgain: Boolean = {
    println("Play Again Y/N")
    val input = userInput
    input match {
      case 'Y' => true
      case 'N' => false
      case _ => playAgain
    }
  }

  def userGuess: RPSEnum = {
    println("Rock, Paper, Scissors?")
    val input = userInput
    input match {
      case 'R' => RPSEnum.rock
      case 'P' => RPSEnum.paper
      case 'S' => RPSEnum.scissors
      case _ => userGuess
    }
  }

  def userInput: Char = {
    try {
      StdIn.readLine().toUpperCase().charAt(0)
    }catch{
      case e: StringIndexOutOfBoundsException => println("invalid input try again")
        userInput
    }
  }

  def userWon(user: RPSEnum) = {
    val ai: RPSEnum = aiGuess
    previousPlayerGuesses.addOne(user)
    user match {
      case RPSEnum.rock => if (ai == RPSEnum.scissors) RPSWinEnum.win
        else if (ai == RPSEnum.rock) RPSWinEnum.draw else RPSWinEnum.loss
      case RPSEnum.paper => if (ai == RPSEnum.rock) RPSWinEnum.win
        else if (ai == RPSEnum.paper) RPSWinEnum.draw else RPSWinEnum.loss
      case RPSEnum.scissors => if (ai == RPSEnum.paper) RPSWinEnum.win
        else if (ai == RPSEnum.scissors) RPSWinEnum.draw else RPSWinEnum.loss
      case _ => throw new IllegalStateException(s"${user.toString}")
    }
  }

  def wonOutput(result: RPSWinEnum) = {
    userStats.addOne(result)
    result match {
      case RPSWinEnum.win => println("You Won")
      case RPSWinEnum.loss => println("You Lost")
      case RPSWinEnum.draw => println("You Drew")
    }
  }

  def aiGuess = {
    if (winStats > 0.5 && previousPlayerGuesses.length > 5
      || previousPlayerGuesses.isEmpty) {
      RPSEnum(Random.between(0, RPSEnum.maxId - 1))
    }
    else {
      getBestGuess
    }
  }

  def winStats = {

    val stats :Double =userStats.count(stat => stat == RPSWinEnum.win) /
         (userStats.count(stat => stat == RPSWinEnum.loss || stat == RPSWinEnum.win ).toDouble)
   stats
  }


  def getBestGuess = {
    previousPlayerGuesses.sortBy(guess => guess.toString)
    var previous = previousPlayerGuesses(0)
    var popular = previousPlayerGuesses(0)
    var count = 1
    var maxCount = 1
    for (i <- 1 until previousPlayerGuesses.length) {
      if (previousPlayerGuesses(i) == previous) count += 1
      else {
        if (count > maxCount) {
          popular = previousPlayerGuesses(i)
          maxCount = count
        }
        previous = previousPlayerGuesses(i)
        count = 1
      }
    }
    if (count > maxCount) previousPlayerGuesses(previousPlayerGuesses.length - 1)
    else getAiGuess(popular)

  }

  def getAiGuess(popular: RPSEnum) = {
    popular match {
      case RPSEnum.rock => RPSEnum.paper
      case RPSEnum.paper => RPSEnum.scissors
      case RPSEnum.scissors => RPSEnum.rock
    }

  }
}