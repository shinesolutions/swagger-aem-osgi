package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties._

case class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties (
  xmphandlerCqFormats: Option[ConfigNodePropertyArray])

object ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesCodecJson: CodecJson[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties] = CodecJson.derive[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties]
  implicit val ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesDecoder: EntityDecoder[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties] = jsonOf[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties]
  implicit val ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesEncoder: EntityEncoder[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties] = jsonEncoderOf[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties]
}