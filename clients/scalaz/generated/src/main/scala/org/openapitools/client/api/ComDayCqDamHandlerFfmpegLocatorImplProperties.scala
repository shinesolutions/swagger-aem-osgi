package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamHandlerFfmpegLocatorImplProperties._

case class ComDayCqDamHandlerFfmpegLocatorImplProperties (
  executableSearchpath: Option[ConfigNodePropertyArray])

object ComDayCqDamHandlerFfmpegLocatorImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqDamHandlerFfmpegLocatorImplPropertiesCodecJson: CodecJson[ComDayCqDamHandlerFfmpegLocatorImplProperties] = CodecJson.derive[ComDayCqDamHandlerFfmpegLocatorImplProperties]
  implicit val ComDayCqDamHandlerFfmpegLocatorImplPropertiesDecoder: EntityDecoder[ComDayCqDamHandlerFfmpegLocatorImplProperties] = jsonOf[ComDayCqDamHandlerFfmpegLocatorImplProperties]
  implicit val ComDayCqDamHandlerFfmpegLocatorImplPropertiesEncoder: EntityEncoder[ComDayCqDamHandlerFfmpegLocatorImplProperties] = jsonEncoderOf[ComDayCqDamHandlerFfmpegLocatorImplProperties]
}
