package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(
  slingServletPaths: Option[ConfigNodePropertyString],
  oauthRevocationActive: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {
  implicit lazy val comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesJsonFormat: Format[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties] = Json.format[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties]
}

