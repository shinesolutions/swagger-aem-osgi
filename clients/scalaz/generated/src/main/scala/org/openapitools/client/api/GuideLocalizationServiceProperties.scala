package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import GuideLocalizationServiceProperties._

case class GuideLocalizationServiceProperties (
  supportedLocales: Option[ConfigNodePropertyArray],
localizableProperties: Option[ConfigNodePropertyArray])

object GuideLocalizationServiceProperties {
  import DateTimeCodecs._

  implicit val GuideLocalizationServicePropertiesCodecJson: CodecJson[GuideLocalizationServiceProperties] = CodecJson.derive[GuideLocalizationServiceProperties]
  implicit val GuideLocalizationServicePropertiesDecoder: EntityDecoder[GuideLocalizationServiceProperties] = jsonOf[GuideLocalizationServiceProperties]
  implicit val GuideLocalizationServicePropertiesEncoder: EntityEncoder[GuideLocalizationServiceProperties] = jsonEncoderOf[GuideLocalizationServiceProperties]
}
