package dto

import scala.math.Ordering

/**
 * Created by linhnm on June 2023
 */

object KafkaConf {
  val bootstrapServer = "94.10.10.131:9092"
  val logTopic = "fenio"
  val messageTopic = "fenio-target"
  val groupId = "spark-streaming-1"
}
