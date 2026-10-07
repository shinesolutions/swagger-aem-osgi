package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheFelixHttpProperties;

@Canonical
class OrgApacheFelixHttpInfo {
    
    String pid
    
    String title
    
    String description
    
    OrgApacheFelixHttpProperties properties
    
    String bundleLocation
    
    String serviceLocation
}
