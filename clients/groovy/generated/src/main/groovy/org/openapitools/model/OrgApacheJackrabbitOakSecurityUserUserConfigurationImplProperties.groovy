package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    
    ConfigNodePropertyString usersPath
    
    ConfigNodePropertyString groupsPath
    
    ConfigNodePropertyString systemRelativePath
    
    ConfigNodePropertyInteger defaultDepth
    
    ConfigNodePropertyDropDown importBehavior
    
    ConfigNodePropertyString passwordHashAlgorithm
    
    ConfigNodePropertyInteger passwordHashIterations
    
    ConfigNodePropertyInteger passwordSaltSize
    
    ConfigNodePropertyBoolean omitAdminPw
    
    ConfigNodePropertyBoolean supportAutoSave
    
    ConfigNodePropertyInteger passwordMaxAge
    
    ConfigNodePropertyBoolean initialPasswordChange
    
    ConfigNodePropertyInteger passwordHistorySize
    
    ConfigNodePropertyBoolean passwordExpiryForAdmin
    
    ConfigNodePropertyInteger cacheExpiration
    
    ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile
}
