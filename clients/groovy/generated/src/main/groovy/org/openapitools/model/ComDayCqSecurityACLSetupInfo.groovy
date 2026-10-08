package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComDayCqSecurityACLSetupProperties;

@Canonical
class ComDayCqSecurityACLSetupInfo {
    
    String pid
    
    String title
    
    String description
    
    ComDayCqSecurityACLSetupProperties properties
    
    String bundleLocation
    
    String serviceLocation
}
