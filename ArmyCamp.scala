package camp

import troops._

case class ArmyCamp(listOfTroops : List[Trooper]) {
  override def toString = {
    val noOfArchers = listOfTroops.collect{
      case Archer => 1
    }.size
    s"Archers : ${noOfArchers} \n Barbarians : ${listOfTroops.size - noOfArchers}"
  }
}