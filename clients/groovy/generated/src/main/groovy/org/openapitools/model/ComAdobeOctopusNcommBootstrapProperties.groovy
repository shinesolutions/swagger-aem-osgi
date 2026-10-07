package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComAdobeOctopusNcommBootstrapProperties {
    
    ConfigNodePropertyInteger maxConnections
    
    ConfigNodePropertyInteger maxRequests
    
    ConfigNodePropertyInteger requestTimeout
    
    ConfigNodePropertyInteger requestRetries
    
    ConfigNodePropertyInteger launchTimeout
}
