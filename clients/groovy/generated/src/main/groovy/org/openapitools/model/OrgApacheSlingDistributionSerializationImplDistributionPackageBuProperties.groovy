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
class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {
    
    ConfigNodePropertyString name
    
    ConfigNodePropertyDropDown type
    
    ConfigNodePropertyString formatTarget
    
    ConfigNodePropertyString tempFsFolder
    
    ConfigNodePropertyInteger fileThreshold
    
    ConfigNodePropertyDropDown memoryUnit
    
    ConfigNodePropertyBoolean useOffHeapMemory
    
    ConfigNodePropertyDropDown digestAlgorithm
    
    ConfigNodePropertyInteger monitoringQueueSize
    
    ConfigNodePropertyInteger cleanupDelay
    
    ConfigNodePropertyArray packageFilters
    
    ConfigNodePropertyArray propertyFilters
}
