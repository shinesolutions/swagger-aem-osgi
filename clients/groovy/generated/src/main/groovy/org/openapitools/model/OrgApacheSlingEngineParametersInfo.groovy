package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheSlingEngineParametersProperties;

@Canonical
class OrgApacheSlingEngineParametersInfo {
    
    String pid
    
    String title
    
    String description
    
    OrgApacheSlingEngineParametersProperties properties
    
    String bundleLocation
    
    String serviceLocation
}
