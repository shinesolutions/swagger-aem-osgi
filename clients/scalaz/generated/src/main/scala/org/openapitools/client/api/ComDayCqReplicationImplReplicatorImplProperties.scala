package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationImplReplicatorImplProperties._

case class ComDayCqReplicationImplReplicatorImplProperties (
  distributeEvents: Option[ConfigNodePropertyBoolean])

object ComDayCqReplicationImplReplicatorImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationImplReplicatorImplPropertiesCodecJson: CodecJson[ComDayCqReplicationImplReplicatorImplProperties] = CodecJson.derive[ComDayCqReplicationImplReplicatorImplProperties]
  implicit val ComDayCqReplicationImplReplicatorImplPropertiesDecoder: EntityDecoder[ComDayCqReplicationImplReplicatorImplProperties] = jsonOf[ComDayCqReplicationImplReplicatorImplProperties]
  implicit val ComDayCqReplicationImplReplicatorImplPropertiesEncoder: EntityEncoder[ComDayCqReplicationImplReplicatorImplProperties] = jsonEncoderOf[ComDayCqReplicationImplReplicatorImplProperties]
}
