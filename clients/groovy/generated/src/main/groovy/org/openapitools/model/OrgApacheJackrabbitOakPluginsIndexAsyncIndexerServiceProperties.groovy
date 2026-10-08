package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {
    
    ConfigNodePropertyArray asyncConfigs
    
    ConfigNodePropertyInteger leaseTimeOutMinutes
    
    ConfigNodePropertyInteger failingIndexTimeoutSeconds
    
    ConfigNodePropertyInteger errorWarnIntervalSeconds
}
