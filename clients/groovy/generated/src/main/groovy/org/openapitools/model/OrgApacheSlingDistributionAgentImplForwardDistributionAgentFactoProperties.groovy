package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties {
    
    ConfigNodePropertyString name
    
    ConfigNodePropertyString title
    
    ConfigNodePropertyString details
    
    ConfigNodePropertyBoolean enabled
    
    ConfigNodePropertyString serviceName
    
    ConfigNodePropertyDropDown logLevel
    
    ConfigNodePropertyArray allowedRoots
    
    ConfigNodePropertyBoolean queueProcessingEnabled
    
    ConfigNodePropertyArray packageImporterEndpoints
    
    ConfigNodePropertyArray passiveQueues
    
    ConfigNodePropertyArray priorityQueues
    
    ConfigNodePropertyDropDown retryStrategy
    
    ConfigNodePropertyInteger retryAttempts
    
    ConfigNodePropertyString requestAuthorizationStrategyTarget
    
    ConfigNodePropertyString transportSecretProviderTarget
    
    ConfigNodePropertyString packageBuilderTarget
    
    ConfigNodePropertyString triggersTarget
    
    ConfigNodePropertyDropDown queueProvider
    
    ConfigNodePropertyBoolean asyncDelivery
    
    ConfigNodePropertyInteger httpConnTimeout
}
