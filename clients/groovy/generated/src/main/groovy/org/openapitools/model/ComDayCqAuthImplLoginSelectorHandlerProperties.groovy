package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqAuthImplLoginSelectorHandlerProperties {
    
    ConfigNodePropertyString path
    
    ConfigNodePropertyInteger serviceRanking
    
    ConfigNodePropertyArray authLoginselectorMappings
    
    ConfigNodePropertyArray authLoginselectorChangepwMappings
    
    ConfigNodePropertyString authLoginselectorDefaultloginpage
    
    ConfigNodePropertyString authLoginselectorDefaultchangepwpage
    
    ConfigNodePropertyArray authLoginselectorHandle
    
    ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions
}
