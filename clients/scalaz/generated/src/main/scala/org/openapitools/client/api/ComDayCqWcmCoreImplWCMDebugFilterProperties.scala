package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplWCMDebugFilterProperties._

case class ComDayCqWcmCoreImplWCMDebugFilterProperties (
  wcmdbgfilterEnabled: Option[ConfigNodePropertyBoolean],
wcmdbgfilterJspDebug: Option[ConfigNodePropertyBoolean])

object ComDayCqWcmCoreImplWCMDebugFilterProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplWCMDebugFilterPropertiesCodecJson: CodecJson[ComDayCqWcmCoreImplWCMDebugFilterProperties] = CodecJson.derive[ComDayCqWcmCoreImplWCMDebugFilterProperties]
  implicit val ComDayCqWcmCoreImplWCMDebugFilterPropertiesDecoder: EntityDecoder[ComDayCqWcmCoreImplWCMDebugFilterProperties] = jsonOf[ComDayCqWcmCoreImplWCMDebugFilterProperties]
  implicit val ComDayCqWcmCoreImplWCMDebugFilterPropertiesEncoder: EntityEncoder[ComDayCqWcmCoreImplWCMDebugFilterProperties] = jsonEncoderOf[ComDayCqWcmCoreImplWCMDebugFilterProperties]
}
