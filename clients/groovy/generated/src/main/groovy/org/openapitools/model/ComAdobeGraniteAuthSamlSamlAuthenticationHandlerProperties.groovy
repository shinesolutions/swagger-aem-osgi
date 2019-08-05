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
    ConfigNodePropertyArray path = null

    ConfigNodePropertyInteger serviceRanking = null

    ConfigNodePropertyString idpUrl = null

    ConfigNodePropertyString idpCertAlias = null

    ConfigNodePropertyBoolean idpHttpRedirect = null

    ConfigNodePropertyString serviceProviderEntityId = null

    ConfigNodePropertyString assertionConsumerServiceURL = null

    ConfigNodePropertyString spPrivateKeyAlias = null

    ConfigNodePropertyString keyStorePassword = null

    ConfigNodePropertyString defaultRedirectUrl = null

    ConfigNodePropertyString userIDAttribute = null

    ConfigNodePropertyBoolean useEncryption = null

    ConfigNodePropertyBoolean createUser = null

    ConfigNodePropertyString userIntermediatePath = null

    ConfigNodePropertyBoolean addGroupMemberships = null

    ConfigNodePropertyString groupMembershipAttribute = null

    ConfigNodePropertyArray defaultGroups = null

    ConfigNodePropertyString nameIdFormat = null

    ConfigNodePropertyArray synchronizeAttributes = null

    ConfigNodePropertyBoolean handleLogout = null

    ConfigNodePropertyString logoutUrl = null

    ConfigNodePropertyInteger clockTolerance = null

    ConfigNodePropertyString digestMethod = null

    ConfigNodePropertyString signatureMethod = null

    ConfigNodePropertyDropDown identitySyncType = null

    ConfigNodePropertyString idpIdentifier = null

}
