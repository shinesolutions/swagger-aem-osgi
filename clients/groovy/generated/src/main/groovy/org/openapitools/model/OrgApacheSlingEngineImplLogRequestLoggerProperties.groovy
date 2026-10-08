package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingEngineImplLogRequestLoggerProperties {
    
    ConfigNodePropertyString requestLogOutput
    
    ConfigNodePropertyDropDown requestLogOutputtype
    
    ConfigNodePropertyBoolean requestLogEnabled
    
    ConfigNodePropertyString accessLogOutput
    
    ConfigNodePropertyDropDown accessLogOutputtype
    
    ConfigNodePropertyBoolean accessLogEnabled
}
