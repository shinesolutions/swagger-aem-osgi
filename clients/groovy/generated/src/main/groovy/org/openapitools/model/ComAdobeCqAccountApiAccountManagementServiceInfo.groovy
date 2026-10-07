package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeCqAccountApiAccountManagementServiceProperties;

@Canonical
class ComAdobeCqAccountApiAccountManagementServiceInfo {
    
    String pid
    
    String title
    
    String description
    
    ComAdobeCqAccountApiAccountManagementServiceProperties properties
    
    String additionalProperties
    
    String bundleLocation
    
    String serviceLocation
}
