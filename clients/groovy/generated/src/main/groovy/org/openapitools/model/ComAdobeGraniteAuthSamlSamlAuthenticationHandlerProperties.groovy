package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {
    
    ConfigNodePropertyArray path
    
    ConfigNodePropertyInteger serviceRanking
    
    ConfigNodePropertyString idpUrl
    
    ConfigNodePropertyString idpCertAlias
    
    ConfigNodePropertyBoolean idpHttpRedirect
    
    ConfigNodePropertyString serviceProviderEntityId
    
    ConfigNodePropertyString assertionConsumerServiceURL
    
    ConfigNodePropertyString spPrivateKeyAlias
    
    ConfigNodePropertyString keyStorePassword
    
    ConfigNodePropertyString defaultRedirectUrl
    
    ConfigNodePropertyString userIDAttribute
    
    ConfigNodePropertyBoolean useEncryption
    
    ConfigNodePropertyBoolean createUser
    
    ConfigNodePropertyString userIntermediatePath
    
    ConfigNodePropertyBoolean addGroupMemberships
    
    ConfigNodePropertyString groupMembershipAttribute
    
    ConfigNodePropertyArray defaultGroups
    
    ConfigNodePropertyString nameIdFormat
    
    ConfigNodePropertyArray synchronizeAttributes
    
    ConfigNodePropertyBoolean handleLogout
    
    ConfigNodePropertyString logoutUrl
    
    ConfigNodePropertyInteger clockTolerance
    
    ConfigNodePropertyString digestMethod
    
    ConfigNodePropertyString signatureMethod
    
    ConfigNodePropertyDropDown identitySyncType
    
    ConfigNodePropertyString idpIdentifier
}
