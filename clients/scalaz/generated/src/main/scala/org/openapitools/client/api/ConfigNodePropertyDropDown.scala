package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ConfigNodePropertyDropDown._

case class ConfigNodePropertyDropDown (
  /* property name */
  name: Option[String],
/* True if optional */
  optional: Option[Boolean],
/* True if property is set */
  isSet: Option[Boolean],
`type`: Option[ConfigNodePropertyDropDownType],
/* Property value */
  value: Option[Any],
/* Property description */
  description: Option[String])

object ConfigNodePropertyDropDown {
  import DateTimeCodecs._

  implicit val ConfigNodePropertyDropDownCodecJson: CodecJson[ConfigNodePropertyDropDown] = CodecJson.derive[ConfigNodePropertyDropDown]
  implicit val ConfigNodePropertyDropDownDecoder: EntityDecoder[ConfigNodePropertyDropDown] = jsonOf[ConfigNodePropertyDropDown]
  implicit val ConfigNodePropertyDropDownEncoder: EntityEncoder[ConfigNodePropertyDropDown] = jsonEncoderOf[ConfigNodePropertyDropDown]
}
