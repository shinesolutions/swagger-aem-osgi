@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("type")
    val type: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("importMode")
    val importMode: ConfigNodePropertyString? = null,

    @field:JsonProperty("aclHandling")
    val aclHandling: ConfigNodePropertyString? = null,

    @field:JsonProperty("package.roots")
    val packageRoots: ConfigNodePropertyString? = null,

    @field:JsonProperty("package.filters")
    val packageFilters: ConfigNodePropertyArray? = null,

    @field:JsonProperty("property.filters")
    val propertyFilters: ConfigNodePropertyArray? = null,

    @field:JsonProperty("tempFsFolder")
    val tempFsFolder: ConfigNodePropertyString? = null,

    @field:JsonProperty("useBinaryReferences")
    val useBinaryReferences: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("autoSaveThreshold")
    val autoSaveThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cleanupDelay")
    val cleanupDelay: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("fileThreshold")
    val fileThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("MEGA_BYTES")
    val MEGA_BYTES: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("useOffHeapMemory")
    val useOffHeapMemory: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("digestAlgorithm")
    val digestAlgorithm: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("monitoringQueueSize")
    val monitoringQueueSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("pathsMapping")
    val pathsMapping: ConfigNodePropertyArray? = null,

    @field:JsonProperty("strictImport")
    val strictImport: ConfigNodePropertyBoolean? = null,

)
