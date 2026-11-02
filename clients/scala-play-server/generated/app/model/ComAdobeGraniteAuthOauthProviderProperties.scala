package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthOauthProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthOauthProviderProperties(
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
  oauthConfigSiblingsAllow: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteAuthOauthProviderProperties {
  implicit lazy val comAdobeGraniteAuthOauthProviderPropertiesJsonFormat: Format[ComAdobeGraniteAuthOauthProviderProperties] = Json.format[ComAdobeGraniteAuthOauthProviderProperties]
}

