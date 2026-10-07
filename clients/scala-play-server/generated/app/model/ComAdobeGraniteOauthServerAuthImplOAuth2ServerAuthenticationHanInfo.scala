package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties]
)

object ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo {
  implicit lazy val comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoJsonFormat: Format[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo] = Json.format[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo]
}

