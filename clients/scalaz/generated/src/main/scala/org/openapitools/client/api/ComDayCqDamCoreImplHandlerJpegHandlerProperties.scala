package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplHandlerJpegHandlerProperties._

case class ComDayCqDamCoreImplHandlerJpegHandlerProperties (
  cqDamEnableExtMetaExtraction: Option[ConfigNodePropertyBoolean],
largeFileThreshold: Option[ConfigNodePropertyInteger],
largeCommentThreshold: Option[ConfigNodePropertyInteger])

object ComDayCqDamCoreImplHandlerJpegHandlerProperties {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplHandlerJpegHandlerPropertiesCodecJson: CodecJson[ComDayCqDamCoreImplHandlerJpegHandlerProperties] = CodecJson.derive[ComDayCqDamCoreImplHandlerJpegHandlerProperties]
  implicit val ComDayCqDamCoreImplHandlerJpegHandlerPropertiesDecoder: EntityDecoder[ComDayCqDamCoreImplHandlerJpegHandlerProperties] = jsonOf[ComDayCqDamCoreImplHandlerJpegHandlerProperties]
  implicit val ComDayCqDamCoreImplHandlerJpegHandlerPropertiesEncoder: EntityEncoder[ComDayCqDamCoreImplHandlerJpegHandlerProperties] = jsonEncoderOf[ComDayCqDamCoreImplHandlerJpegHandlerProperties]
}
