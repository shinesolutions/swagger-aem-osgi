package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteMonitoringImplScriptConfigImplProperties {
    
    ConfigNodePropertyString scriptFilename
    
    ConfigNodePropertyString scriptDisplay
    
    ConfigNodePropertyString scriptPath
    
    ConfigNodePropertyArray scriptPlatform
    
    ConfigNodePropertyInteger interval
    
    ConfigNodePropertyString jmxdomain
}
