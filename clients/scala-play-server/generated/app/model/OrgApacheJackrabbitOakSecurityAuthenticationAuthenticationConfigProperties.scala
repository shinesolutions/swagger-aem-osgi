package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(
  orgApacheJackrabbitOakAuthenticationAppName: Option[ConfigNodePropertyString],
  orgApacheJackrabbitOakAuthenticationConfigSpiName: Option[ConfigNodePropertyString]
)

object OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {
  implicit lazy val orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesJsonFormat: Format[OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties] = Json.format[OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties]
}

