package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties]
)

object ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo {
  implicit lazy val comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoJsonFormat: Format[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo] = Json.format[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo]
}

