package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties._

case class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties (
  authTokenValidatorType: Option[ConfigNodePropertyString])

object ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesCodecJson: CodecJson[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties] = CodecJson.derive[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties]
  implicit val ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesDecoder: EntityDecoder[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties] = jsonOf[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties]
  implicit val ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesEncoder: EntityEncoder[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties] = jsonEncoderOf[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties]
}