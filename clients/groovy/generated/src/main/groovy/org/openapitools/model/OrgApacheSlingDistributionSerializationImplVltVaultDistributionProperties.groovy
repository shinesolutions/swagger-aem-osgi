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
    ConfigNodePropertyString name = null

    ConfigNodePropertyDropDown type = null

    ConfigNodePropertyString importMode = null

    ConfigNodePropertyString aclHandling = null

    ConfigNodePropertyString packageRoots = null

    ConfigNodePropertyArray packageFilters = null

    ConfigNodePropertyArray propertyFilters = null

    ConfigNodePropertyString tempFsFolder = null

    ConfigNodePropertyBoolean useBinaryReferences = null

    ConfigNodePropertyInteger autoSaveThreshold = null

    ConfigNodePropertyInteger cleanupDelay = null

    ConfigNodePropertyInteger fileThreshold = null

    ConfigNodePropertyDropDown MEGA_BYTES = null

    ConfigNodePropertyBoolean useOffHeapMemory = null

    ConfigNodePropertyDropDown digestAlgorithm = null

    ConfigNodePropertyInteger monitoringQueueSize = null

    ConfigNodePropertyArray pathsMapping = null

    ConfigNodePropertyBoolean strictImport = null

}
