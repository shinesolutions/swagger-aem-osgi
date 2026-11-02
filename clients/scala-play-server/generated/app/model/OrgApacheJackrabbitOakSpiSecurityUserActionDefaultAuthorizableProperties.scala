package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(
  enabledActions: Option[ConfigNodePropertyDropDown],
  userPrivilegeNames: Option[ConfigNodePropertyArray],
  groupPrivilegeNames: Option[ConfigNodePropertyArray],
  constraint: Option[ConfigNodePropertyString]
)

object OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties {
  implicit lazy val orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesJsonFormat: Format[OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties] = Json.format[OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties]
}

