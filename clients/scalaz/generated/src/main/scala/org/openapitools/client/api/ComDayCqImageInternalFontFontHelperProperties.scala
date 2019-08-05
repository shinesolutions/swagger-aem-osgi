package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqImageInternalFontFontHelperProperties._

case class ComDayCqImageInternalFontFontHelperProperties (
  fontpath: Option[ConfigNodePropertyArray],
oversamplingFactor: Option[ConfigNodePropertyInteger])

object ComDayCqImageInternalFontFontHelperProperties {
  import DateTimeCodecs._

  implicit val ComDayCqImageInternalFontFontHelperPropertiesCodecJson: CodecJson[ComDayCqImageInternalFontFontHelperProperties] = CodecJson.derive[ComDayCqImageInternalFontFontHelperProperties]
  implicit val ComDayCqImageInternalFontFontHelperPropertiesDecoder: EntityDecoder[ComDayCqImageInternalFontFontHelperProperties] = jsonOf[ComDayCqImageInternalFontFontHelperProperties]
  implicit val ComDayCqImageInternalFontFontHelperPropertiesEncoder: EntityEncoder[ComDayCqImageInternalFontFontHelperProperties] = jsonEncoderOf[ComDayCqImageInternalFontFontHelperProperties]
}
