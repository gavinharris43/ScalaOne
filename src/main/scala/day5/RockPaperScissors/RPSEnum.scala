package day5.RockPaperScissors

object RPSEnum extends Enumeration {

  type RPSEnum = Value

  val rock = Value("Rock")
  val paper = Value("Paper")
  val scissors = Value("Scissors")
  val error = Value("error")

}
