package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamIdsImplIDSJobProcessorProperties {
    
    ConfigNodePropertyBoolean enableMultisession
    
    ConfigNodePropertyBoolean idsCcEnable
    
    ConfigNodePropertyBoolean enableRetry
    
    ConfigNodePropertyBoolean enableRetryScripterror
    
    ConfigNodePropertyString externalizerDomainCqhost
    
    ConfigNodePropertyString externalizerDomainHttp
}
