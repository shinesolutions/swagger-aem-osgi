package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheAriesJmxFrameworkStateConfigProperties;

@Canonical
class OrgApacheAriesJmxFrameworkStateConfigInfo {
    
    String pid
    
    String title
    
    String description
    
    OrgApacheAriesJmxFrameworkStateConfigProperties properties
    
    String bundleLocation
    
    String serviceLocation
}
