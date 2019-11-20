package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthOauthAccesstokenProviderProperties._

case class ComAdobeGraniteAuthOauthAccesstokenProviderProperties (
  name: Option[ConfigNodePropertyString],
authTokenProviderTitle: Option[ConfigNodePropertyString],
authTokenProviderDefaultClaims: Option[ConfigNodePropertyArray],
authTokenProviderEndpoint: Option[ConfigNodePropertyString],
authAccessTokenRequest: Option[ConfigNodePropertyString],
authTokenProviderKeypairAlias: Option[ConfigNodePropertyString],
authTokenProviderConnTimeout: Option[ConfigNodePropertyInteger],
authTokenProviderSoTimeout: Option[ConfigNodePropertyInteger],
authTokenProviderClientId: Option[ConfigNodePropertyString],
authTokenProviderScope: Option[ConfigNodePropertyString],
authTokenProviderReuseAccessToken: Option[ConfigNodePropertyBoolean],
authTokenProviderRelaxedSsl: Option[ConfigNodePropertyBoolean],
tokenRequestCustomizerType: Option[ConfigNodePropertyString],
authTokenValidatorType: Option[ConfigNodePropertyString])

object ComAdobeGraniteAuthOauthAccesstokenProviderProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesCodecJson: CodecJson[ComAdobeGraniteAuthOauthAccesstokenProviderProperties] = CodecJson.derive[ComAdobeGraniteAuthOauthAccesstokenProviderProperties]
  implicit val ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesDecoder: EntityDecoder[ComAdobeGraniteAuthOauthAccesstokenProviderProperties] = jsonOf[ComAdobeGraniteAuthOauthAccesstokenProviderProperties]
  implicit val ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesEncoder: EntityEncoder[ComAdobeGraniteAuthOauthAccesstokenProviderProperties] = jsonEncoderOf[ComAdobeGraniteAuthOauthAccesstokenProviderProperties]
}