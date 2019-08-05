package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationImplTransportHttpProperties._

case class ComDayCqReplicationImplTransportHttpProperties (
  disabledCipherSuites: Option[ConfigNodePropertyArray],
enabledCipherSuites: Option[ConfigNodePropertyArray])

object ComDayCqReplicationImplTransportHttpProperties {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationImplTransportHttpPropertiesCodecJson: CodecJson[ComDayCqReplicationImplTransportHttpProperties] = CodecJson.derive[ComDayCqReplicationImplTransportHttpProperties]
  implicit val ComDayCqReplicationImplTransportHttpPropertiesDecoder: EntityDecoder[ComDayCqReplicationImplTransportHttpProperties] = jsonOf[ComDayCqReplicationImplTransportHttpProperties]
  implicit val ComDayCqReplicationImplTransportHttpPropertiesEncoder: EntityEncoder[ComDayCqReplicationImplTransportHttpProperties] = jsonEncoderOf[ComDayCqReplicationImplTransportHttpProperties]
}
