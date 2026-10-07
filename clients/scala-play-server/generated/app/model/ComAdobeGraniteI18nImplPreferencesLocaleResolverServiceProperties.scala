package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties(
  securityPreferencesName: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties {
  implicit lazy val comAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesJsonFormat: Format[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties] = Json.format[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties]
}

