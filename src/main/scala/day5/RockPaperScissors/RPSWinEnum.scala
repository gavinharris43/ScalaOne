package day5.RockPaperScissors

object RPSWinEnum extends Enumeration {

  type RPSWinEnum = Value

  val win = Value("Win")
  val loss = Value("Loss")
  val draw = Value("Draw")

}
