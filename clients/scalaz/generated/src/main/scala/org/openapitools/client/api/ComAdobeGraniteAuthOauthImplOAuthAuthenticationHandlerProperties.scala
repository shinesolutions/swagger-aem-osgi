package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties._

case class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties (
  `path`: Option[ConfigNodePropertyString])

object ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesCodecJson: CodecJson[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties] = CodecJson.derive[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties]
  implicit val ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesDecoder: EntityDecoder[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties] = jsonOf[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties]
  implicit val ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesEncoder: EntityEncoder[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties] = jsonEncoderOf[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties]
}