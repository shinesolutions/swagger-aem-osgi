package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(
  oauthClientRevocationActive: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties {
  implicit lazy val comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesJsonFormat: Format[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties] = Json.format[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties]
}

