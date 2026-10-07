package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(
  path: Option[ConfigNodePropertyString],
  jaasControlFlag: Option[ConfigNodePropertyString],
  jaasRealmName: Option[ConfigNodePropertyString],
  jaasRanking: Option[ConfigNodePropertyInteger],
  oauthOfflineValidation: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {
  implicit lazy val comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesJsonFormat: Format[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties] = Json.format[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties]
}

