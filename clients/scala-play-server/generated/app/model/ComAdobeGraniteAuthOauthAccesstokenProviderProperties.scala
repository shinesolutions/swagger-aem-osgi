package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthOauthAccesstokenProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthOauthAccesstokenProviderProperties(
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
  authTokenValidatorType: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteAuthOauthAccesstokenProviderProperties {
  implicit lazy val comAdobeGraniteAuthOauthAccesstokenProviderPropertiesJsonFormat: Format[ComAdobeGraniteAuthOauthAccesstokenProviderProperties] = Json.format[ComAdobeGraniteAuthOauthAccesstokenProviderProperties]
}

