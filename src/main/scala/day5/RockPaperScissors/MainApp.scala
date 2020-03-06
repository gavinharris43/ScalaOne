package day5.RockPaperScissors

import day5.RockPaperScissors.UserInput._


object MainApp extends App {

  println("Enter Name")
  val rockPaperScissors = new RockPaperScissors(userInputString)

  rockPaperScissors.run


}
