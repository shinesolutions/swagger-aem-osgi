package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqJcrclustersupportClusterStartLevelControllerProperties._

case class ComDayCqJcrclustersupportClusterStartLevelControllerProperties (
  clusterLevelEnable: Option[ConfigNodePropertyBoolean],
clusterMasterLevel: Option[ConfigNodePropertyInteger],
clusterSlaveLevel: Option[ConfigNodePropertyInteger])

object ComDayCqJcrclustersupportClusterStartLevelControllerProperties {
  import DateTimeCodecs._

  implicit val ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesCodecJson: CodecJson[ComDayCqJcrclustersupportClusterStartLevelControllerProperties] = CodecJson.derive[ComDayCqJcrclustersupportClusterStartLevelControllerProperties]
  implicit val ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesDecoder: EntityDecoder[ComDayCqJcrclustersupportClusterStartLevelControllerProperties] = jsonOf[ComDayCqJcrclustersupportClusterStartLevelControllerProperties]
  implicit val ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesEncoder: EntityEncoder[ComDayCqJcrclustersupportClusterStartLevelControllerProperties] = jsonEncoderOf[ComDayCqJcrclustersupportClusterStartLevelControllerProperties]
}