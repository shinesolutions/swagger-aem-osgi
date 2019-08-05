package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties {
    ConfigNodePropertyString handlerName = null

    ConfigNodePropertyString userExpirationTime = null

    ConfigNodePropertyArray userAutoMembership = null

    ConfigNodePropertyArray userPropertyMapping = null

    ConfigNodePropertyString userPathPrefix = null

    ConfigNodePropertyString userMembershipExpTime = null

    ConfigNodePropertyInteger userMembershipNestingDepth = null

    ConfigNodePropertyBoolean userDynamicMembership = null

    ConfigNodePropertyBoolean userDisableMissing = null

    ConfigNodePropertyString groupExpirationTime = null

    ConfigNodePropertyArray groupAutoMembership = null

    ConfigNodePropertyArray groupPropertyMapping = null

    ConfigNodePropertyString groupPathPrefix = null

    ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile = null

}
