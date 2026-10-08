package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheFelixJaasConfigurationSpiProperties;

@Canonical
class OrgApacheFelixJaasConfigurationSpiInfo {
    
    String pid
    
    String title
    
    String description
    
    OrgApacheFelixJaasConfigurationSpiProperties properties
    
    String bundleLocation
    
    String serviceLocation
}
