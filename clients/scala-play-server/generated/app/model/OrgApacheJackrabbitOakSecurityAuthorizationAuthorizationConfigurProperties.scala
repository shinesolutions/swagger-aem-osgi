package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(
  permissionsJr2: Option[ConfigNodePropertyDropDown],
  importBehavior: Option[ConfigNodePropertyDropDown],
  readPaths: Option[ConfigNodePropertyArray],
  administrativePrincipals: Option[ConfigNodePropertyArray],
  configurationRanking: Option[ConfigNodePropertyInteger]
)

object OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {
  implicit lazy val orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesJsonFormat: Format[OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties] = Json.format[OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties]
}

