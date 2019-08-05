package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplWarpTimeWarpFilterProperties._

case class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties (
  filterOrder: Option[ConfigNodePropertyString],
filterScope: Option[ConfigNodePropertyString])

object ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesCodecJson: CodecJson[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties] = CodecJson.derive[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties]
  implicit val ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesDecoder: EntityDecoder[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties] = jsonOf[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties]
  implicit val ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesEncoder: EntityEncoder[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties] = jsonEncoderOf[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties]
}
