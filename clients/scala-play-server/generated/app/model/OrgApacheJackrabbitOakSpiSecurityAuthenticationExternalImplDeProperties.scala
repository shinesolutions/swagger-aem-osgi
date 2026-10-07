package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(
  handlerName: Option[ConfigNodePropertyString],
  userExpirationTime: Option[ConfigNodePropertyString],
  userAutoMembership: Option[ConfigNodePropertyArray],
  userPropertyMapping: Option[ConfigNodePropertyArray],
  userPathPrefix: Option[ConfigNodePropertyString],
  userMembershipExpTime: Option[ConfigNodePropertyString],
  userMembershipNestingDepth: Option[ConfigNodePropertyInteger],
  userDynamicMembership: Option[ConfigNodePropertyBoolean],
  userDisableMissing: Option[ConfigNodePropertyBoolean],
  groupExpirationTime: Option[ConfigNodePropertyString],
  groupAutoMembership: Option[ConfigNodePropertyArray],
  groupPropertyMapping: Option[ConfigNodePropertyArray],
  groupPathPrefix: Option[ConfigNodePropertyString],
  enableRFC7613UsercaseMappedProfile: Option[ConfigNodePropertyBoolean]
)

object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties {
  implicit lazy val orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesJsonFormat: Format[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties] = Json.format[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties]
}

