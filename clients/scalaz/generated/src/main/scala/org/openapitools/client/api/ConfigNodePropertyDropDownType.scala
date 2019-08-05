package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ConfigNodePropertyDropDownType._

case class ConfigNodePropertyDropDownType (
  /* Drop Down label */
  labels: Option[Any],
/* Drown Down value */
  values: Option[Any])

object ConfigNodePropertyDropDownType {
  import DateTimeCodecs._

  implicit val ConfigNodePropertyDropDownTypeCodecJson: CodecJson[ConfigNodePropertyDropDownType] = CodecJson.derive[ConfigNodePropertyDropDownType]
  implicit val ConfigNodePropertyDropDownTypeDecoder: EntityDecoder[ConfigNodePropertyDropDownType] = jsonOf[ConfigNodePropertyDropDownType]
  implicit val ConfigNodePropertyDropDownTypeEncoder: EntityEncoder[ConfigNodePropertyDropDownType] = jsonEncoderOf[ConfigNodePropertyDropDownType]
}
