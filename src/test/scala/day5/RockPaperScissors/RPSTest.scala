package day5.RockPaperScissors
import org.mockito.Mockito._


class RPSTest extends UnitSpec{

  //Arrange
  val rPS =spy(new RockPaperScissors("Gavin"))


  //Assert
  assert(rPS.isInstanceOf[RockPaperScissors], true)
  assert(rPS.name == "GAVIN")
  assert(rPS.previousPlayerGuesses.isEmpty)
  assert(rPS.userStats.isEmpty)
  assert(rPS.winStats==0.00)

  //Act
  when(rPS.aiGuess)thenReturn(RPSEnum.rock)

  //Assert
  assert(RPSWinEnum.draw ==rPS.userWon(RPSEnum.rock))
  assert(RPSWinEnum.win ==rPS.userWon(RPSEnum.paper))
  assert(RPSWinEnum.loss ==rPS.userWon(RPSEnum.scissors))

  val ui =mock[UserInput]
  when (ui.userInputChar)thenReturn('Y')

  assert(rPS.playAgain,true)




}
