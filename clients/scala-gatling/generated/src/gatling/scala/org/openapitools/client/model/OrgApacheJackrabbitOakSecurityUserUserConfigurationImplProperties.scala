
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties (
    _usersPath: Option[ConfigNodePropertyString],
    _groupsPath: Option[ConfigNodePropertyString],
    _systemRelativePath: Option[ConfigNodePropertyString],
    _defaultDepth: Option[ConfigNodePropertyInteger],
    _importBehavior: Option[ConfigNodePropertyDropDown],
    _passwordHashAlgorithm: Option[ConfigNodePropertyString],
    _passwordHashIterations: Option[ConfigNodePropertyInteger],
    _passwordSaltSize: Option[ConfigNodePropertyInteger],
    _omitAdminPw: Option[ConfigNodePropertyBoolean],
    _supportAutoSave: Option[ConfigNodePropertyBoolean],
    _passwordMaxAge: Option[ConfigNodePropertyInteger],
    _initialPasswordChange: Option[ConfigNodePropertyBoolean],
    _passwordHistorySize: Option[ConfigNodePropertyInteger],
    _passwordExpiryForAdmin: Option[ConfigNodePropertyBoolean],
    _cacheExpiration: Option[ConfigNodePropertyInteger],
    _enableRFC7613UsercaseMappedProfile: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    def toStringBody(var_usersPath: Object, var_groupsPath: Object, var_systemRelativePath: Object, var_defaultDepth: Object, var_importBehavior: Object, var_passwordHashAlgorithm: Object, var_passwordHashIterations: Object, var_passwordSaltSize: Object, var_omitAdminPw: Object, var_supportAutoSave: Object, var_passwordMaxAge: Object, var_initialPasswordChange: Object, var_passwordHistorySize: Object, var_passwordExpiryForAdmin: Object, var_cacheExpiration: Object, var_enableRFC7613UsercaseMappedProfile: Object) =
        s"""
        | {
        | "usersPath":$var_usersPath,"groupsPath":$var_groupsPath,"systemRelativePath":$var_systemRelativePath,"defaultDepth":$var_defaultDepth,"importBehavior":$var_importBehavior,"passwordHashAlgorithm":$var_passwordHashAlgorithm,"passwordHashIterations":$var_passwordHashIterations,"passwordSaltSize":$var_passwordSaltSize,"omitAdminPw":$var_omitAdminPw,"supportAutoSave":$var_supportAutoSave,"passwordMaxAge":$var_passwordMaxAge,"initialPasswordChange":$var_initialPasswordChange,"passwordHistorySize":$var_passwordHistorySize,"passwordExpiryForAdmin":$var_passwordExpiryForAdmin,"cacheExpiration":$var_cacheExpiration,"enableRFC7613UsercaseMappedProfile":$var_enableRFC7613UsercaseMappedProfile
        | }
        """.stripMargin
}
