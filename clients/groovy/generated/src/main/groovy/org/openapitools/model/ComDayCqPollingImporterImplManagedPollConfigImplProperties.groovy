package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqPollingImporterImplManagedPollConfigImplProperties {
    
    ConfigNodePropertyString id
    
    ConfigNodePropertyBoolean enabled
    
    ConfigNodePropertyBoolean reference
    
    ConfigNodePropertyInteger interval
    
    ConfigNodePropertyString expression
    
    ConfigNodePropertyString source
    
    ConfigNodePropertyString target
    
    ConfigNodePropertyString login
    
    ConfigNodePropertyString password
}
