package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties]
)

object ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo {
  implicit lazy val comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoJsonFormat: Format[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo] = Json.format[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo]
}

