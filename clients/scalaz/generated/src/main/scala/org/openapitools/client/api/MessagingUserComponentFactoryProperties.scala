package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import MessagingUserComponentFactoryProperties._

case class MessagingUserComponentFactoryProperties (
  priority: Option[ConfigNodePropertyInteger])

object MessagingUserComponentFactoryProperties {
  import DateTimeCodecs._

  implicit val MessagingUserComponentFactoryPropertiesCodecJson: CodecJson[MessagingUserComponentFactoryProperties] = CodecJson.derive[MessagingUserComponentFactoryProperties]
  implicit val MessagingUserComponentFactoryPropertiesDecoder: EntityDecoder[MessagingUserComponentFactoryProperties] = jsonOf[MessagingUserComponentFactoryProperties]
  implicit val MessagingUserComponentFactoryPropertiesEncoder: EntityEncoder[MessagingUserComponentFactoryProperties] = jsonEncoderOf[MessagingUserComponentFactoryProperties]
}
