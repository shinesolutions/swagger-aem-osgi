package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamIdsImplIDSPoolManagerImplProperties {
    
    ConfigNodePropertyInteger maxErrorsToBlacklist
    
    ConfigNodePropertyInteger retryIntervalToWhitelist
    
    ConfigNodePropertyInteger connectTimeout
    
    ConfigNodePropertyInteger socketTimeout
    
    ConfigNodePropertyString processLabel
    
    ConfigNodePropertyInteger connectionUseMax
}
