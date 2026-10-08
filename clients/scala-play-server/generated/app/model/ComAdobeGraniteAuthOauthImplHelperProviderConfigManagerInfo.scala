package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo {
  implicit lazy val comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoJsonFormat: Format[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo] = Json.format[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo]
}

