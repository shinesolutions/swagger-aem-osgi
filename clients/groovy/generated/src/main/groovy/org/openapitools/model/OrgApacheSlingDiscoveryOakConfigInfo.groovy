package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheSlingDiscoveryOakConfigProperties;

@Canonical
class OrgApacheSlingDiscoveryOakConfigInfo {
    
    String pid
    
    String title
    
    String description
    
    OrgApacheSlingDiscoveryOakConfigProperties properties
    
    String bundleLocation
    
    String serviceLocation
}
