package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(
  path: Option[ConfigNodePropertyString],
  oauthClientIdsAllowed: Option[ConfigNodePropertyArray],
  authBearerSyncIms: Option[ConfigNodePropertyBoolean],
  authTokenRequestParameter: Option[ConfigNodePropertyString],
  oauthBearerConfigid: Option[ConfigNodePropertyString],
  oauthJwtSupport: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {
  implicit lazy val comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesJsonFormat: Format[ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties] = Json.format[ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties]
}

