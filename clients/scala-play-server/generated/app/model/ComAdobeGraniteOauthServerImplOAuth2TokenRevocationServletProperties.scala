package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(
  oauthTokenRevocationActive: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {
  implicit lazy val comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesJsonFormat: Format[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties] = Json.format[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties]
}

