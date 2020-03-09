package day5.RockPaperScissors



object MainApp extends App {

  println("Enter Name")
  val userInput = new UserInput
  val rockPaperScissors = new RockPaperScissors(userInput.userInputString)

  rockPaperScissors.run


}
