import RPSSL.RockPaperScissorSpocLizard
import RPSSL.RockPaperScissorSpocLizard._
import org.scalatest.FlatSpec

class TestSpec extends FlatSpec {

  "A RPSLS" should "give winner as Rock(1) in Rock vs Scissor match" in {
    val res = RockPaperScissorSpocLizard.winner(Rock,Scissors)
    assert(res == 1)
  }

  it should "give a tie when both the inputs are same i.e Lizard vs Lizard" in {
    val res = RockPaperScissorSpocLizard.winner(Lizard,Lizard)
    assert(res == 0)
  }

  it should "give loser as Spoc in a Spoc vs Paper match" in {
    val res = RockPaperScissorSpocLizard.winner(Spoc,Paper)
    assert(res == 2)
  }

  it should "return a statistics result of wins and loses" in {
    val totalNumberOfGames = 1
    val res: Result = RockPaperScissorSpocLizard.result(Lizard,totalNumberOfGames)
    assert((res.player1Wins+res.player2Wins+res.tie)==totalNumberOfGames)
  }
}