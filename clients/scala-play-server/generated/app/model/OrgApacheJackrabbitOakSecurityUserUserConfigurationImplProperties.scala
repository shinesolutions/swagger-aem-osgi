package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(
  usersPath: Option[ConfigNodePropertyString],
  groupsPath: Option[ConfigNodePropertyString],
  systemRelativePath: Option[ConfigNodePropertyString],
  defaultDepth: Option[ConfigNodePropertyInteger],
  importBehavior: Option[ConfigNodePropertyDropDown],
  passwordHashAlgorithm: Option[ConfigNodePropertyString],
  passwordHashIterations: Option[ConfigNodePropertyInteger],
  passwordSaltSize: Option[ConfigNodePropertyInteger],
  omitAdminPw: Option[ConfigNodePropertyBoolean],
  supportAutoSave: Option[ConfigNodePropertyBoolean],
  passwordMaxAge: Option[ConfigNodePropertyInteger],
  initialPasswordChange: Option[ConfigNodePropertyBoolean],
  passwordHistorySize: Option[ConfigNodePropertyInteger],
  passwordExpiryForAdmin: Option[ConfigNodePropertyBoolean],
  cacheExpiration: Option[ConfigNodePropertyInteger],
  enableRFC7613UsercaseMappedProfile: Option[ConfigNodePropertyBoolean]
)

object OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
  implicit lazy val orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesJsonFormat: Format[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties] = Json.format[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties]
}

