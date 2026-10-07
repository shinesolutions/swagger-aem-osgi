package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(
  jaasRanking: Option[ConfigNodePropertyInteger],
  jaasControlFlag: Option[ConfigNodePropertyString],
  jaasRealmName: Option[ConfigNodePropertyString],
  idpName: Option[ConfigNodePropertyString],
  syncHandlerName: Option[ConfigNodePropertyString]
)

object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {
  implicit lazy val orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesJsonFormat: Format[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties] = Json.format[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties]
}

