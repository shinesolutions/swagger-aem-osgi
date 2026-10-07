
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties (
    _providerName: Option[ConfigNodePropertyString],
    _hostName: Option[ConfigNodePropertyString],
    _hostPort: Option[ConfigNodePropertyInteger],
    _hostSsl: Option[ConfigNodePropertyBoolean],
    _hostTls: Option[ConfigNodePropertyBoolean],
    _hostNoCertCheck: Option[ConfigNodePropertyBoolean],
    _bindDn: Option[ConfigNodePropertyString],
    _bindPassword: Option[ConfigNodePropertyString],
    _searchTimeout: Option[ConfigNodePropertyString],
    _adminPoolMaxActive: Option[ConfigNodePropertyInteger],
    _adminPoolLookupOnValidate: Option[ConfigNodePropertyBoolean],
    _userPoolMaxActive: Option[ConfigNodePropertyInteger],
    _userPoolLookupOnValidate: Option[ConfigNodePropertyBoolean],
    _userBaseDN: Option[ConfigNodePropertyString],
    _userObjectclass: Option[ConfigNodePropertyArray],
    _userIdAttribute: Option[ConfigNodePropertyString],
    _userExtraFilter: Option[ConfigNodePropertyString],
    _userMakeDnPath: Option[ConfigNodePropertyBoolean],
    _groupBaseDN: Option[ConfigNodePropertyString],
    _groupObjectclass: Option[ConfigNodePropertyArray],
    _groupNameAttribute: Option[ConfigNodePropertyString],
    _groupExtraFilter: Option[ConfigNodePropertyString],
    _groupMakeDnPath: Option[ConfigNodePropertyBoolean],
    _groupMemberAttribute: Option[ConfigNodePropertyString],
    _useUidForExtId: Option[ConfigNodePropertyBoolean],
    _customattributes: Option[ConfigNodePropertyArray]
)
object OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {
    def toStringBody(var_providerName: Object, var_hostName: Object, var_hostPort: Object, var_hostSsl: Object, var_hostTls: Object, var_hostNoCertCheck: Object, var_bindDn: Object, var_bindPassword: Object, var_searchTimeout: Object, var_adminPoolMaxActive: Object, var_adminPoolLookupOnValidate: Object, var_userPoolMaxActive: Object, var_userPoolLookupOnValidate: Object, var_userBaseDN: Object, var_userObjectclass: Object, var_userIdAttribute: Object, var_userExtraFilter: Object, var_userMakeDnPath: Object, var_groupBaseDN: Object, var_groupObjectclass: Object, var_groupNameAttribute: Object, var_groupExtraFilter: Object, var_groupMakeDnPath: Object, var_groupMemberAttribute: Object, var_useUidForExtId: Object, var_customattributes: Object) =
        s"""
        | {
        | "providerName":$var_providerName,"hostName":$var_hostName,"hostPort":$var_hostPort,"hostSsl":$var_hostSsl,"hostTls":$var_hostTls,"hostNoCertCheck":$var_hostNoCertCheck,"bindDn":$var_bindDn,"bindPassword":$var_bindPassword,"searchTimeout":$var_searchTimeout,"adminPoolMaxActive":$var_adminPoolMaxActive,"adminPoolLookupOnValidate":$var_adminPoolLookupOnValidate,"userPoolMaxActive":$var_userPoolMaxActive,"userPoolLookupOnValidate":$var_userPoolLookupOnValidate,"userBaseDN":$var_userBaseDN,"userObjectclass":$var_userObjectclass,"userIdAttribute":$var_userIdAttribute,"userExtraFilter":$var_userExtraFilter,"userMakeDnPath":$var_userMakeDnPath,"groupBaseDN":$var_groupBaseDN,"groupObjectclass":$var_groupObjectclass,"groupNameAttribute":$var_groupNameAttribute,"groupExtraFilter":$var_groupExtraFilter,"groupMakeDnPath":$var_groupMakeDnPath,"groupMemberAttribute":$var_groupMemberAttribute,"useUidForExtId":$var_useUidForExtId,"customattributes":$var_customattributes
        | }
        """.stripMargin
}
