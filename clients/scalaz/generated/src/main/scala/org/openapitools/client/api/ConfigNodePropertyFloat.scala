package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ConfigNodePropertyFloat._

case class ConfigNodePropertyFloat (
  /* property name */
  name: Option[String],
/* True if optional */
  optional: Option[Boolean],
/* True if property is set */
  isSet: Option[Boolean],
/* Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String) */
  `type`: Option[Integer],
/* Property value */
  value: Option[BigDecimal],
/* Property description */
  description: Option[String])

object ConfigNodePropertyFloat {
  import DateTimeCodecs._

  implicit val ConfigNodePropertyFloatCodecJson: CodecJson[ConfigNodePropertyFloat] = CodecJson.derive[ConfigNodePropertyFloat]
  implicit val ConfigNodePropertyFloatDecoder: EntityDecoder[ConfigNodePropertyFloat] = jsonOf[ConfigNodePropertyFloat]
  implicit val ConfigNodePropertyFloatEncoder: EntityEncoder[ConfigNodePropertyFloat] = jsonEncoderOf[ConfigNodePropertyFloat]
}
