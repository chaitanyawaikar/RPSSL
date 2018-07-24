package trainingGround

import troops._
import common._

sealed trait TrainingGround {
  def maxCapacity: Int
}

case object Barracks extends TrainingGround {

  override def maxCapacity = 10

  private var listOfTroops = List[Trooper]()

  def addTroops(inputList: List[Trooper]) :Output= {
    listOfTroops.size > 10 match {
      case true => Output(Left(BarracksFullException))
      case false =>

        if ((listOfTroops.size + inputList.size) > 10)
          Output(Left(InputExceedsLimitException))
        else {
          listOfTroops = listOfTroops ++ inputList
          println("Training...")
//          inputList.map{
//            case Archer =>
//              Thread.sleep(Archer.trainingTime)
//            case Barbarian =>
//              Thread.sleep(Barbarian.trainingTime)
//          }
          Output(Right(CurrentStatus(listOfTroops)))
        }
    }
  }
}