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
    
    ConfigNodePropertyString handlerName
    
    ConfigNodePropertyString userExpirationTime
    
    ConfigNodePropertyArray userAutoMembership
    
    ConfigNodePropertyArray userPropertyMapping
    
    ConfigNodePropertyString userPathPrefix
    
    ConfigNodePropertyString userMembershipExpTime
    
    ConfigNodePropertyInteger userMembershipNestingDepth
    
    ConfigNodePropertyBoolean userDynamicMembership
    
    ConfigNodePropertyBoolean userDisableMissing
    
    ConfigNodePropertyString groupExpirationTime
    
    ConfigNodePropertyArray groupAutoMembership
    
    ConfigNodePropertyArray groupPropertyMapping
    
    ConfigNodePropertyString groupPathPrefix
    
    ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile
}
