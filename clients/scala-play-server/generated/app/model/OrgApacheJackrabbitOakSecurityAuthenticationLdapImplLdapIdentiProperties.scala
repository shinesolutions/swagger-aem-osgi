package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(
  providerName: Option[ConfigNodePropertyString],
  hostName: Option[ConfigNodePropertyString],
  hostPort: Option[ConfigNodePropertyInteger],
  hostSsl: Option[ConfigNodePropertyBoolean],
  hostTls: Option[ConfigNodePropertyBoolean],
  hostNoCertCheck: Option[ConfigNodePropertyBoolean],
  bindDn: Option[ConfigNodePropertyString],
  bindPassword: Option[ConfigNodePropertyString],
  searchTimeout: Option[ConfigNodePropertyString],
  adminPoolMaxActive: Option[ConfigNodePropertyInteger],
  adminPoolLookupOnValidate: Option[ConfigNodePropertyBoolean],
  userPoolMaxActive: Option[ConfigNodePropertyInteger],
  userPoolLookupOnValidate: Option[ConfigNodePropertyBoolean],
  userBaseDN: Option[ConfigNodePropertyString],
  userObjectclass: Option[ConfigNodePropertyArray],
  userIdAttribute: Option[ConfigNodePropertyString],
  userExtraFilter: Option[ConfigNodePropertyString],
  userMakeDnPath: Option[ConfigNodePropertyBoolean],
  groupBaseDN: Option[ConfigNodePropertyString],
  groupObjectclass: Option[ConfigNodePropertyArray],
  groupNameAttribute: Option[ConfigNodePropertyString],
  groupExtraFilter: Option[ConfigNodePropertyString],
  groupMakeDnPath: Option[ConfigNodePropertyBoolean],
  groupMemberAttribute: Option[ConfigNodePropertyString],
  useUidForExtId: Option[ConfigNodePropertyBoolean],
  customattributes: Option[ConfigNodePropertyArray]
)

object OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {
  implicit lazy val orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesJsonFormat: Format[OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties] = Json.format[OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties]
}

