@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("type")
    val type: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("format.target")
    val formatTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("tempFsFolder")
    val tempFsFolder: ConfigNodePropertyString? = null,

    @field:JsonProperty("fileThreshold")
    val fileThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("memoryUnit")
    val memoryUnit: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("useOffHeapMemory")
    val useOffHeapMemory: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("digestAlgorithm")
    val digestAlgorithm: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("monitoringQueueSize")
    val monitoringQueueSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cleanupDelay")
    val cleanupDelay: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("package.filters")
    val packageFilters: ConfigNodePropertyArray? = null,

    @field:JsonProperty("property.filters")
    val propertyFilters: ConfigNodePropertyArray? = null,

)
