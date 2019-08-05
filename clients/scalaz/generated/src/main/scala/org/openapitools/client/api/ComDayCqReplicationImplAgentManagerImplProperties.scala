package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationImplAgentManagerImplProperties._

case class ComDayCqReplicationImplAgentManagerImplProperties (
  jobTopics: Option[ConfigNodePropertyString],
serviceUserTarget: Option[ConfigNodePropertyString],
agentProviderTarget: Option[ConfigNodePropertyString])

object ComDayCqReplicationImplAgentManagerImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationImplAgentManagerImplPropertiesCodecJson: CodecJson[ComDayCqReplicationImplAgentManagerImplProperties] = CodecJson.derive[ComDayCqReplicationImplAgentManagerImplProperties]
  implicit val ComDayCqReplicationImplAgentManagerImplPropertiesDecoder: EntityDecoder[ComDayCqReplicationImplAgentManagerImplProperties] = jsonOf[ComDayCqReplicationImplAgentManagerImplProperties]
  implicit val ComDayCqReplicationImplAgentManagerImplPropertiesEncoder: EntityEncoder[ComDayCqReplicationImplAgentManagerImplProperties] = jsonEncoderOf[ComDayCqReplicationImplAgentManagerImplProperties]
}
