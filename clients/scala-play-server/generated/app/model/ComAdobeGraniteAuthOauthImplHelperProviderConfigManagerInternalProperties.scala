package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties(
  oauthCookieLoginTimeout: Option[ConfigNodePropertyString],
  oauthCookieMaxAge: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties {
  implicit lazy val comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesJsonFormat: Format[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties] = Json.format[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties]
}

