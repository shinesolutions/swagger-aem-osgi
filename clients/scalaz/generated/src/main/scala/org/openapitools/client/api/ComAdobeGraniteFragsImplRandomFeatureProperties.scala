package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteFragsImplRandomFeatureProperties._

case class ComAdobeGraniteFragsImplRandomFeatureProperties (
  featureName: Option[ConfigNodePropertyString],
featureDescription: Option[ConfigNodePropertyString],
activePercentage: Option[ConfigNodePropertyString],
cookieName: Option[ConfigNodePropertyString],
cookieMaxAge: Option[ConfigNodePropertyInteger])

object ComAdobeGraniteFragsImplRandomFeatureProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteFragsImplRandomFeaturePropertiesCodecJson: CodecJson[ComAdobeGraniteFragsImplRandomFeatureProperties] = CodecJson.derive[ComAdobeGraniteFragsImplRandomFeatureProperties]
  implicit val ComAdobeGraniteFragsImplRandomFeaturePropertiesDecoder: EntityDecoder[ComAdobeGraniteFragsImplRandomFeatureProperties] = jsonOf[ComAdobeGraniteFragsImplRandomFeatureProperties]
  implicit val ComAdobeGraniteFragsImplRandomFeaturePropertiesEncoder: EntityEncoder[ComAdobeGraniteFragsImplRandomFeatureProperties] = jsonEncoderOf[ComAdobeGraniteFragsImplRandomFeatureProperties]
}
