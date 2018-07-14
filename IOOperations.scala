package common

import troops._

/**
 * Created by trai01 on 14-07-2018.
 */
sealed trait IOOperations
case class Input(noOfBarbarians : Int,noOfArchers : Int) extends IOOperations
case class CurrentStatus(list: List[Trooper]) extends IOOperations
case class Output(output : Either[ClashOfClansException,CurrentStatus]) extends IOOperations

