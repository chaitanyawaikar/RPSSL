package common

/**
 * Created by trai01 on 14-07-2018.
 */
sealed trait ClashOfClansException
case object BarracksFullException extends ClashOfClansException
case object InputExceedsLimitException extends ClashOfClansException
