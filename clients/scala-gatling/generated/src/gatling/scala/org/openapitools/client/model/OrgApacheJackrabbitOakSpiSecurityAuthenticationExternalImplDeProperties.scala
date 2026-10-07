
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties (
    _handlerName: Option[ConfigNodePropertyString],
    _userExpirationTime: Option[ConfigNodePropertyString],
    _userAutoMembership: Option[ConfigNodePropertyArray],
    _userPropertyMapping: Option[ConfigNodePropertyArray],
    _userPathPrefix: Option[ConfigNodePropertyString],
    _userMembershipExpTime: Option[ConfigNodePropertyString],
    _userMembershipNestingDepth: Option[ConfigNodePropertyInteger],
    _userDynamicMembership: Option[ConfigNodePropertyBoolean],
    _userDisableMissing: Option[ConfigNodePropertyBoolean],
    _groupExpirationTime: Option[ConfigNodePropertyString],
    _groupAutoMembership: Option[ConfigNodePropertyArray],
    _groupPropertyMapping: Option[ConfigNodePropertyArray],
    _groupPathPrefix: Option[ConfigNodePropertyString],
    _enableRFC7613UsercaseMappedProfile: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties {
    def toStringBody(var_handlerName: Object, var_userExpirationTime: Object, var_userAutoMembership: Object, var_userPropertyMapping: Object, var_userPathPrefix: Object, var_userMembershipExpTime: Object, var_userMembershipNestingDepth: Object, var_userDynamicMembership: Object, var_userDisableMissing: Object, var_groupExpirationTime: Object, var_groupAutoMembership: Object, var_groupPropertyMapping: Object, var_groupPathPrefix: Object, var_enableRFC7613UsercaseMappedProfile: Object) =
        s"""
        | {
        | "handlerName":$var_handlerName,"userExpirationTime":$var_userExpirationTime,"userAutoMembership":$var_userAutoMembership,"userPropertyMapping":$var_userPropertyMapping,"userPathPrefix":$var_userPathPrefix,"userMembershipExpTime":$var_userMembershipExpTime,"userMembershipNestingDepth":$var_userMembershipNestingDepth,"userDynamicMembership":$var_userDynamicMembership,"userDisableMissing":$var_userDisableMissing,"groupExpirationTime":$var_groupExpirationTime,"groupAutoMembership":$var_groupAutoMembership,"groupPropertyMapping":$var_groupPropertyMapping,"groupPathPrefix":$var_groupPathPrefix,"enableRFC7613UsercaseMappedProfile":$var_enableRFC7613UsercaseMappedProfile
        | }
        """.stripMargin
}
