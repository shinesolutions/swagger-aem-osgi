package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCommonsHttpclientProperties._

case class ComDayCommonsHttpclientProperties (
  proxyEnabled: Option[ConfigNodePropertyBoolean],
proxyHost: Option[ConfigNodePropertyString],
proxyUser: Option[ConfigNodePropertyString],
proxyPassword: Option[ConfigNodePropertyString],
proxyNtlmHost: Option[ConfigNodePropertyString],
proxyNtlmDomain: Option[ConfigNodePropertyString],
proxyExceptions: Option[ConfigNodePropertyArray])

object ComDayCommonsHttpclientProperties {
  import DateTimeCodecs._

  implicit val ComDayCommonsHttpclientPropertiesCodecJson: CodecJson[ComDayCommonsHttpclientProperties] = CodecJson.derive[ComDayCommonsHttpclientProperties]
  implicit val ComDayCommonsHttpclientPropertiesDecoder: EntityDecoder[ComDayCommonsHttpclientProperties] = jsonOf[ComDayCommonsHttpclientProperties]
  implicit val ComDayCommonsHttpclientPropertiesEncoder: EntityEncoder[ComDayCommonsHttpclientProperties] = jsonEncoderOf[ComDayCommonsHttpclientProperties]
}
