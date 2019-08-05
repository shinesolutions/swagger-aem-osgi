package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ConfigNodePropertyInteger._

case class ConfigNodePropertyInteger (
  /* property name */
  name: Option[String],
/* True if optional */
  optional: Option[Boolean],
/* True if property is set */
  isSet: Option[Boolean],
/* Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String) */
  `type`: Option[Integer],
/* Property value */
  value: Option[Integer],
/* Property description */
  description: Option[String])

object ConfigNodePropertyInteger {
  import DateTimeCodecs._

  implicit val ConfigNodePropertyIntegerCodecJson: CodecJson[ConfigNodePropertyInteger] = CodecJson.derive[ConfigNodePropertyInteger]
  implicit val ConfigNodePropertyIntegerDecoder: EntityDecoder[ConfigNodePropertyInteger] = jsonOf[ConfigNodePropertyInteger]
  implicit val ConfigNodePropertyIntegerEncoder: EntityEncoder[ConfigNodePropertyInteger] = jsonEncoderOf[ConfigNodePropertyInteger]
}
