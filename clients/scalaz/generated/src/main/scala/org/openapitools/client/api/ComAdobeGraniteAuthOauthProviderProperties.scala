package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthOauthProviderProperties._

case class ComAdobeGraniteAuthOauthProviderProperties (
  oauthConfigId: Option[ConfigNodePropertyString],
oauthClientId: Option[ConfigNodePropertyString],
oauthClientSecret: Option[ConfigNodePropertyString],
oauthScope: Option[ConfigNodePropertyArray],
oauthConfigProviderId: Option[ConfigNodePropertyString],
oauthCreateUsers: Option[ConfigNodePropertyBoolean],
oauthUseridProperty: Option[ConfigNodePropertyString],
forceStrictUsernameMatching: Option[ConfigNodePropertyBoolean],
oauthEncodeUserids: Option[ConfigNodePropertyBoolean],
oauthHashUserids: Option[ConfigNodePropertyBoolean],
oauthCallBackUrl: Option[ConfigNodePropertyString],
oauthAccessTokenPersist: Option[ConfigNodePropertyBoolean],
oauthAccessTokenPersistCookie: Option[ConfigNodePropertyBoolean],
oauthCsrfStateProtection: Option[ConfigNodePropertyBoolean],
oauthRedirectRequestParams: Option[ConfigNodePropertyBoolean],
oauthConfigSiblingsAllow: Option[ConfigNodePropertyBoolean])

object ComAdobeGraniteAuthOauthProviderProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthOauthProviderPropertiesCodecJson: CodecJson[ComAdobeGraniteAuthOauthProviderProperties] = CodecJson.derive[ComAdobeGraniteAuthOauthProviderProperties]
  implicit val ComAdobeGraniteAuthOauthProviderPropertiesDecoder: EntityDecoder[ComAdobeGraniteAuthOauthProviderProperties] = jsonOf[ComAdobeGraniteAuthOauthProviderProperties]
  implicit val ComAdobeGraniteAuthOauthProviderPropertiesEncoder: EntityEncoder[ComAdobeGraniteAuthOauthProviderProperties] = jsonEncoderOf[ComAdobeGraniteAuthOauthProviderProperties]
}
