package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {
    
    ConfigNodePropertyDropDown permissionsJr2
    
    ConfigNodePropertyDropDown importBehavior
    
    ConfigNodePropertyArray readPaths
    
    ConfigNodePropertyArray administrativePrincipals
    
    ConfigNodePropertyInteger configurationRanking
}
