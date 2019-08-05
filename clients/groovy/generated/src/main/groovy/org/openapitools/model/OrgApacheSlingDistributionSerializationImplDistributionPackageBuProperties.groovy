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
    ConfigNodePropertyString name = null

    ConfigNodePropertyDropDown type = null

    ConfigNodePropertyString formatTarget = null

    ConfigNodePropertyString tempFsFolder = null

    ConfigNodePropertyInteger fileThreshold = null

    ConfigNodePropertyDropDown memoryUnit = null

    ConfigNodePropertyBoolean useOffHeapMemory = null

    ConfigNodePropertyDropDown digestAlgorithm = null

    ConfigNodePropertyInteger monitoringQueueSize = null

    ConfigNodePropertyInteger cleanupDelay = null

    ConfigNodePropertyArray packageFilters = null

    ConfigNodePropertyArray propertyFilters = null

}
