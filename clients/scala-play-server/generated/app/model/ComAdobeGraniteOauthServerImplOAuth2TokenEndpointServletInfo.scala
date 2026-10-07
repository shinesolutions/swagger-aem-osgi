package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties]
)

object ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo {
  implicit lazy val comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoJsonFormat: Format[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo] = Json.format[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo]
}

