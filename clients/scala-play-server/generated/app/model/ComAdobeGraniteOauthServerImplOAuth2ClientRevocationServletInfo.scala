package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties]
)

object ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo {
  implicit lazy val comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoJsonFormat: Format[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo] = Json.format[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo]
}

