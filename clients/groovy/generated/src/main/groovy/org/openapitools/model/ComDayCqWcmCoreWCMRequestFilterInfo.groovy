package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComDayCqWcmCoreWCMRequestFilterProperties;

@Canonical
class ComDayCqWcmCoreWCMRequestFilterInfo {
    
    String pid
    
    String title
    
    String description
    
    ComDayCqWcmCoreWCMRequestFilterProperties properties
    
    String bundleLocation
    
    String serviceLocation
}
