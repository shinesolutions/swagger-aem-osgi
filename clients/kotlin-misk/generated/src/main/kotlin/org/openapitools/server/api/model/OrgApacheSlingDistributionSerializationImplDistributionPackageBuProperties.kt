package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(
    val name: ConfigNodePropertyString? = null,
    val type: ConfigNodePropertyDropDown? = null,
    val formatTarget: ConfigNodePropertyString? = null,
    val tempFsFolder: ConfigNodePropertyString? = null,
    val fileThreshold: ConfigNodePropertyInteger? = null,
    val memoryUnit: ConfigNodePropertyDropDown? = null,
    val useOffHeapMemory: ConfigNodePropertyBoolean? = null,
    val digestAlgorithm: ConfigNodePropertyDropDown? = null,
    val monitoringQueueSize: ConfigNodePropertyInteger? = null,
    val cleanupDelay: ConfigNodePropertyInteger? = null,
    val packageFilters: ConfigNodePropertyArray? = null,
    val propertyFilters: ConfigNodePropertyArray? = null
)
