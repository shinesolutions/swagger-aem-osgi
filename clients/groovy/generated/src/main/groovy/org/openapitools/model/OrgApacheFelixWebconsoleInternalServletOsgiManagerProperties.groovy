package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {
    
    ConfigNodePropertyString managerRoot
    
    ConfigNodePropertyString httpServiceFilter
    
    ConfigNodePropertyString defaultRender
    
    ConfigNodePropertyString realm
    
    ConfigNodePropertyString username
    
    ConfigNodePropertyString password
    
    ConfigNodePropertyString category
    
    ConfigNodePropertyString locale
    
    ConfigNodePropertyDropDown loglevel
    
    ConfigNodePropertyDropDown plugins
}
