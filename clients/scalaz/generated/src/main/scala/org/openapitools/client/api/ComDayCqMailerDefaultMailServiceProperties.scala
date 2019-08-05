package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqMailerDefaultMailServiceProperties._

case class ComDayCqMailerDefaultMailServiceProperties (
  smtpHost: Option[ConfigNodePropertyString],
smtpPort: Option[ConfigNodePropertyInteger],
smtpUser: Option[ConfigNodePropertyString],
smtpPassword: Option[ConfigNodePropertyString],
fromAddress: Option[ConfigNodePropertyString],
smtpSsl: Option[ConfigNodePropertyBoolean],
smtpStarttls: Option[ConfigNodePropertyBoolean],
debugEmail: Option[ConfigNodePropertyBoolean])

object ComDayCqMailerDefaultMailServiceProperties {
  import DateTimeCodecs._

  implicit val ComDayCqMailerDefaultMailServicePropertiesCodecJson: CodecJson[ComDayCqMailerDefaultMailServiceProperties] = CodecJson.derive[ComDayCqMailerDefaultMailServiceProperties]
  implicit val ComDayCqMailerDefaultMailServicePropertiesDecoder: EntityDecoder[ComDayCqMailerDefaultMailServiceProperties] = jsonOf[ComDayCqMailerDefaultMailServiceProperties]
  implicit val ComDayCqMailerDefaultMailServicePropertiesEncoder: EntityEncoder[ComDayCqMailerDefaultMailServiceProperties] = jsonEncoderOf[ComDayCqMailerDefaultMailServiceProperties]
}
