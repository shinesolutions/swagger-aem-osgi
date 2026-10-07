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
class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties {
    
    ConfigNodePropertyString name
    
    ConfigNodePropertyDropDown type
    
    ConfigNodePropertyString importMode
    
    ConfigNodePropertyString aclHandling
    
    ConfigNodePropertyString packageRoots
    
    ConfigNodePropertyArray packageFilters
    
    ConfigNodePropertyArray propertyFilters
    
    ConfigNodePropertyString tempFsFolder
    
    ConfigNodePropertyBoolean useBinaryReferences
    
    ConfigNodePropertyInteger autoSaveThreshold
    
    ConfigNodePropertyInteger cleanupDelay
    
    ConfigNodePropertyInteger fileThreshold
    
    ConfigNodePropertyDropDown MEGA_BYTES
    
    ConfigNodePropertyBoolean useOffHeapMemory
    
    ConfigNodePropertyDropDown digestAlgorithm
    
    ConfigNodePropertyInteger monitoringQueueSize
    
    ConfigNodePropertyArray pathsMapping
    
    ConfigNodePropertyBoolean strictImport
}
