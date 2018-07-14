package starter

import controller.GameController

/**
 * Created by trai01 on 14-07-2018.
 *
 *
 */
object StarterApp extends App {

  println("Welcome to Clash Of clans game")

  while (true) {
    println("1. train troops")
    println("2. view troop camp")
    println("What do you want to do ?")
    
    scala.io.StdIn.readLine().toInt match {
      case 1 =>
         
//        println("which troops you want to train")
//        println("1. Archers")
//        println("2. Barbarians")
//        val troopsType = scala.io.StdIn.readLine().toInt
//        println("How many troops you want to train ?")
//        val troopsCount = scala.io.StdIn.readLine().toInt
//        GameController.trainTroops(troopsType, troopsCount)
        
        println("Enter the number of archers that you want to train")
        val archersNumber = scala.io.StdIn.readLine().toInt
        println("Enter the number of Barbarians that you want to train")
        val barNumber = scala.io.StdIn.readLine().toInt
        GameController.trainTroops(archersNumber, barNumber)
        
        
      case 2 =>
 
        println(GameController.printCampStatus)
        
      case _ => println("Sorry wrong input")
    }
    println("----------------------xx----------------------------")
    println()
    println()
  }

}
