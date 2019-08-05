package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqMailerImplCqMailingServiceProperties._

case class ComDayCqMailerImplCqMailingServiceProperties (
  maxRecipientCount: Option[ConfigNodePropertyString])

object ComDayCqMailerImplCqMailingServiceProperties {
  import DateTimeCodecs._

  implicit val ComDayCqMailerImplCqMailingServicePropertiesCodecJson: CodecJson[ComDayCqMailerImplCqMailingServiceProperties] = CodecJson.derive[ComDayCqMailerImplCqMailingServiceProperties]
  implicit val ComDayCqMailerImplCqMailingServicePropertiesDecoder: EntityDecoder[ComDayCqMailerImplCqMailingServiceProperties] = jsonOf[ComDayCqMailerImplCqMailingServiceProperties]
  implicit val ComDayCqMailerImplCqMailingServicePropertiesEncoder: EntityEncoder[ComDayCqMailerImplCqMailingServiceProperties] = jsonEncoderOf[ComDayCqMailerImplCqMailingServiceProperties]
}
