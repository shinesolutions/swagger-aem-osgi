package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(
  oauthIssuer: Option[ConfigNodePropertyString],
  oauthAccessTokenExpiresIn: Option[ConfigNodePropertyString],
  osgiHttpWhiteboardServletPattern: Option[ConfigNodePropertyString],
  osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties {
  implicit lazy val comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesJsonFormat: Format[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties] = Json.format[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties]
}

