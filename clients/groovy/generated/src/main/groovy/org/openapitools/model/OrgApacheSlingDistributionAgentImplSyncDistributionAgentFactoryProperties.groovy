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
class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {
    
    ConfigNodePropertyString name
    
    ConfigNodePropertyString title
    
    ConfigNodePropertyString details
    
    ConfigNodePropertyBoolean enabled
    
    ConfigNodePropertyString serviceName
    
    ConfigNodePropertyDropDown logLevel
    
    ConfigNodePropertyBoolean queueProcessingEnabled
    
    ConfigNodePropertyArray passiveQueues
    
    ConfigNodePropertyArray packageExporterEndpoints
    
    ConfigNodePropertyArray packageImporterEndpoints
    
    ConfigNodePropertyDropDown retryStrategy
    
    ConfigNodePropertyInteger retryAttempts
    
    ConfigNodePropertyInteger pullItems
    
    ConfigNodePropertyInteger httpConnTimeout
    
    ConfigNodePropertyString requestAuthorizationStrategyTarget
    
    ConfigNodePropertyString transportSecretProviderTarget
    
    ConfigNodePropertyString packageBuilderTarget
    
    ConfigNodePropertyString triggersTarget
}
