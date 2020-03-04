package day2

import scala.collection.mutable.ListBuffer
import scala.io.{Source, StdIn}
import scala.util.Random

object day2Problem extends App {

  val filename = "src/main/scala/day2/keys.txt"

  runHangman()

  def runHangman(): Unit = {
    val word = getRandomWord
    var lives = 11;
    var wordGuess = "_"*word.length

    while (lives >= 0){

      if (lives == 0) {
        println("You Have Been Hung")
        lives-=1
      } else {
        println("Guess Letter")
        val input :Char = StdIn.readChar()
        if (!guessLetter(word, input)){
          lives -= 1
          println("lives Remaining "+ lives)
        } else{
         wordGuess= wordGuess.updated(word.indexOf(input),input)
         var lastArray= findNext(word, input)

          while (lastArray != -1) {

            wordGuess = wordGuess.updated(lastArray, input)
            lastArray= word.indexOf(lastArray+1)
          }
          println(wordGuess)
          println("correct")
          if(areWinner(wordGuess)){
            println(s"Lives Left: $lives")
            println("You Have Won Congratulations!!! \n You have not been sentenced to death my hanging.")
            lives = -1
          }
        }
      }
    }
  }
  def findNext(word:String, input :Char): Int ={
    word.indexOf(input, word.indexOf(input)+1)
  }

  def readFile = {
    val lines: ListBuffer[String] = ListBuffer.empty
    for (line <- Source.fromFile(filename).getLines()) lines.addOne(line)
    lines
  }

  def areWinner(wordGuess :String): Boolean ={
    if(wordGuess.contains("_")){
      false
    }else {
      true
    }
  }

  def getRandomWord = {
    val listOfWords = readFile
    val listSize = listOfWords.length
    val random = new Random
    listOfWords(random.nextInt(listSize + 1))
  }

  def guessLetter(word: String, input :Char): Boolean = {
    if (word contains input){
      println(input)
      true
    }else{
      false
    }
  }



}
