package day5.RockPaperScissors

import scala.io.StdIn

object UserInput {

  def userInputChar: Char = {
    try {
      StdIn.readLine().toUpperCase().charAt(0)
    }catch{
      case e: StringIndexOutOfBoundsException => println("invalid input try again")
        userInputChar
    }
  }
  def userInputString: String = {
    try {
      StdIn.readLine().toUpperCase()
    }catch{
      case e: StringIndexOutOfBoundsException => println("invalid input try again")
        userInputString
    }
  }
}
