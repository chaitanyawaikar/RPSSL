package RPSSL

import java.util.Random

object RockPaperScissorSpocLizard extends App {

  case class Result(player1Wins: Int, player2Wins: Int, tie: Int)

  sealed trait Item
  object Rock extends Item
  object Paper extends Item
  object Scissors extends Item
  object Lizard extends Item
  object Spoc extends Item

  //1 if item1 is winner,2 if item2 is winner and 0 if tie
  def winner[T <: Item](item1: T, item2: T): Int = {
    (item1, item2) match {
      case (Rock, Paper | Spoc) => 2
      case (Rock, Scissors | Lizard) => 1
      case (Paper, Scissors | Lizard) => 2
      case (Paper, Spoc | Rock) => 1
      case (Scissors, Paper | Lizard) => 1
      case (Scissors, Spoc | Rock) => 2
      case (Spoc, Scissors | Rock) => 1
      case (Spoc, Paper | Lizard) => 2
      case (Lizard, Rock | Scissors) => 2
      case (Lizard, Paper | Spoc) => 1
      case (x, y) if x == y => 0
    }
  }


  def result(player1: Item, n: Int): Result = {
    val listOfItems = List(Rock, Paper, Scissors, Spoc, Lizard)
    val rand = new Random()

    val stats = (1 to n).map(x => winner(player1, listOfItems(rand.nextInt(listOfItems.size)))).groupBy(identity).map(x =>
      (x._1, x._2.length))
    Result(stats.get(1).getOrElse(0), stats.get(2).getOrElse(0), stats.get(0).getOrElse(0))
  }


  //Starting point of the program
  println("Enter the number of games you wish to play")
  val numberOfGames = scala.io.StdIn.readInt()
  
  //As per the given problem, it is assumed that Player1 will always select Lizard and Player2 will select randomly.
  val res = result(Lizard, numberOfGames)

  println(s"Player A wins ${res.player1Wins} of ${numberOfGames} games")
  println(s"Player B wins ${res.player2Wins} of ${numberOfGames} games")
  println(s"Tie ${res.tie} of ${numberOfGames} games")
}
