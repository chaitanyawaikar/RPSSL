package controller

import trainingGround.Barracks
import troops._
import common._
import camp._

object GameController {
  
  private var armyCamp = ArmyCamp(List[Trooper]()) 
  
  def updateArmyCampStatus(list : List[Trooper]) ={
    armyCamp = ArmyCamp(list)
  }
  
  def printCampStatus = armyCamp.toString()
 
  def trainTroops(troopType:Int,noOfTroops:Int) ={
//    val troopsList = troopType match{
//      case 1 => List.fill(noOfTroops)(Archer)
//      case 2 => List.fill(noOfTroops)(Barbarian)
//    }
    val troopsList = List.fill(troopType)(Archer) ++ List.fill(noOfTroops)(Barbarian)
    Barracks.addTroops(troopsList).output match{
      case Left(ex) =>
        println("Troops cannot be added as it exceeds the Barracks capacity")
      case Right(data) =>
        updateArmyCampStatus(armyCamp.listOfTroops ++  data.list)
        println("Training complete. Troops are available in the troop camp")
    }
  }
  
}