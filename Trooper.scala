package troops

/**
 * Created by trai01 on 14-07-2018.
 */
sealed trait Trooper {
  def trainingTime :Int
  def trainingCost :Int
}

case object Barbarian extends Trooper{
  override def trainingTime = 3
  override def trainingCost = 10
}

case object Archer extends Trooper{
  override def trainingTime = 6
  override def trainingCost = 20
}