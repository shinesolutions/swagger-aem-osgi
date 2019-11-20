package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties._

case class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties (
  oauthTokenRevocationActive: Option[ConfigNodePropertyBoolean])

object ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesCodecJson: CodecJson[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties] = CodecJson.derive[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties]
  implicit val ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesDecoder: EntityDecoder[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties] = jsonOf[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties]
  implicit val ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesEncoder: EntityEncoder[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties] = jsonEncoderOf[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties]
}