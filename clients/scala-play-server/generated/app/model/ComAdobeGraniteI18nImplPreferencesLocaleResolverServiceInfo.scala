package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties]
)

object ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo {
  implicit lazy val comAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoJsonFormat: Format[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo] = Json.format[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo]
}

