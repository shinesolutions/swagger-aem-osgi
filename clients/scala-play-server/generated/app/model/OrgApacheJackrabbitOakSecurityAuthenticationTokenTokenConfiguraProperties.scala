package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(
  tokenExpiration: Option[ConfigNodePropertyString],
  tokenLength: Option[ConfigNodePropertyString],
  tokenRefresh: Option[ConfigNodePropertyBoolean],
  tokenCleanupThreshold: Option[ConfigNodePropertyInteger],
  passwordHashAlgorithm: Option[ConfigNodePropertyString],
  passwordHashIterations: Option[ConfigNodePropertyInteger],
  passwordSaltSize: Option[ConfigNodePropertyInteger]
)

object OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {
  implicit lazy val orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesJsonFormat: Format[OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties] = Json.format[OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties]
}

