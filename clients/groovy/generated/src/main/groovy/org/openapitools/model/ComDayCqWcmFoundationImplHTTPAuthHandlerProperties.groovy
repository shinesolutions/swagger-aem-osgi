package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {
    
    ConfigNodePropertyString path
    
    ConfigNodePropertyBoolean authHttpNologin
    
    ConfigNodePropertyString authHttpRealm
    
    ConfigNodePropertyString authDefaultLoginpage
    
    ConfigNodePropertyArray authCredForm
    
    ConfigNodePropertyArray authCredUtf8
}
