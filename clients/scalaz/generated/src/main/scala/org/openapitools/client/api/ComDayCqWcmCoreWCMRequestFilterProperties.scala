package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreWCMRequestFilterProperties._

case class ComDayCqWcmCoreWCMRequestFilterProperties (
  wcmfilterMode: Option[ConfigNodePropertyDropDown])

object ComDayCqWcmCoreWCMRequestFilterProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreWCMRequestFilterPropertiesCodecJson: CodecJson[ComDayCqWcmCoreWCMRequestFilterProperties] = CodecJson.derive[ComDayCqWcmCoreWCMRequestFilterProperties]
  implicit val ComDayCqWcmCoreWCMRequestFilterPropertiesDecoder: EntityDecoder[ComDayCqWcmCoreWCMRequestFilterProperties] = jsonOf[ComDayCqWcmCoreWCMRequestFilterProperties]
  implicit val ComDayCqWcmCoreWCMRequestFilterPropertiesEncoder: EntityEncoder[ComDayCqWcmCoreWCMRequestFilterProperties] = jsonEncoderOf[ComDayCqWcmCoreWCMRequestFilterProperties]
}
