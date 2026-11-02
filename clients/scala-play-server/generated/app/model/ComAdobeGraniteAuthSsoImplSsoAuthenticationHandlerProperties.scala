package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(
  path: Option[ConfigNodePropertyString],
  serviceRanking: Option[ConfigNodePropertyInteger],
  jaasControlFlag: Option[ConfigNodePropertyString],
  jaasRealmName: Option[ConfigNodePropertyString],
  jaasRanking: Option[ConfigNodePropertyInteger],
  headers: Option[ConfigNodePropertyArray],
  cookies: Option[ConfigNodePropertyArray],
  parameters: Option[ConfigNodePropertyArray],
  usermap: Option[ConfigNodePropertyArray],
  format: Option[ConfigNodePropertyString],
  trustedCredentialsAttribute: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {
  implicit lazy val comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesJsonFormat: Format[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties] = Json.format[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties]
}

