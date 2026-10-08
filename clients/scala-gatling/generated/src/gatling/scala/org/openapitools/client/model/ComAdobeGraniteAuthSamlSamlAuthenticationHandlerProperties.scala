
package org.openapitools.client.model


case class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties (
    _path: Option[ConfigNodePropertyArray],
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _idpUrl: Option[ConfigNodePropertyString],
    _idpCertAlias: Option[ConfigNodePropertyString],
    _idpHttpRedirect: Option[ConfigNodePropertyBoolean],
    _serviceProviderEntityId: Option[ConfigNodePropertyString],
    _assertionConsumerServiceURL: Option[ConfigNodePropertyString],
    _spPrivateKeyAlias: Option[ConfigNodePropertyString],
    _keyStorePassword: Option[ConfigNodePropertyString],
    _defaultRedirectUrl: Option[ConfigNodePropertyString],
    _userIDAttribute: Option[ConfigNodePropertyString],
    _useEncryption: Option[ConfigNodePropertyBoolean],
    _createUser: Option[ConfigNodePropertyBoolean],
    _userIntermediatePath: Option[ConfigNodePropertyString],
    _addGroupMemberships: Option[ConfigNodePropertyBoolean],
    _groupMembershipAttribute: Option[ConfigNodePropertyString],
    _defaultGroups: Option[ConfigNodePropertyArray],
    _nameIdFormat: Option[ConfigNodePropertyString],
    _synchronizeAttributes: Option[ConfigNodePropertyArray],
    _handleLogout: Option[ConfigNodePropertyBoolean],
    _logoutUrl: Option[ConfigNodePropertyString],
    _clockTolerance: Option[ConfigNodePropertyInteger],
    _digestMethod: Option[ConfigNodePropertyString],
    _signatureMethod: Option[ConfigNodePropertyString],
    _identitySyncType: Option[ConfigNodePropertyDropDown],
    _idpIdentifier: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {
    def toStringBody(var_path: Object, var_serviceRanking: Object, var_idpUrl: Object, var_idpCertAlias: Object, var_idpHttpRedirect: Object, var_serviceProviderEntityId: Object, var_assertionConsumerServiceURL: Object, var_spPrivateKeyAlias: Object, var_keyStorePassword: Object, var_defaultRedirectUrl: Object, var_userIDAttribute: Object, var_useEncryption: Object, var_createUser: Object, var_userIntermediatePath: Object, var_addGroupMemberships: Object, var_groupMembershipAttribute: Object, var_defaultGroups: Object, var_nameIdFormat: Object, var_synchronizeAttributes: Object, var_handleLogout: Object, var_logoutUrl: Object, var_clockTolerance: Object, var_digestMethod: Object, var_signatureMethod: Object, var_identitySyncType: Object, var_idpIdentifier: Object) =
        s"""
        | {
        | "path":$var_path,"serviceRanking":$var_serviceRanking,"idpUrl":$var_idpUrl,"idpCertAlias":$var_idpCertAlias,"idpHttpRedirect":$var_idpHttpRedirect,"serviceProviderEntityId":$var_serviceProviderEntityId,"assertionConsumerServiceURL":$var_assertionConsumerServiceURL,"spPrivateKeyAlias":$var_spPrivateKeyAlias,"keyStorePassword":$var_keyStorePassword,"defaultRedirectUrl":$var_defaultRedirectUrl,"userIDAttribute":$var_userIDAttribute,"useEncryption":$var_useEncryption,"createUser":$var_createUser,"userIntermediatePath":$var_userIntermediatePath,"addGroupMemberships":$var_addGroupMemberships,"groupMembershipAttribute":$var_groupMembershipAttribute,"defaultGroups":$var_defaultGroups,"nameIdFormat":$var_nameIdFormat,"synchronizeAttributes":$var_synchronizeAttributes,"handleLogout":$var_handleLogout,"logoutUrl":$var_logoutUrl,"clockTolerance":$var_clockTolerance,"digestMethod":$var_digestMethod,"signatureMethod":$var_signatureMethod,"identitySyncType":$var_identitySyncType,"idpIdentifier":$var_idpIdentifier
        | }
        """.stripMargin
}
