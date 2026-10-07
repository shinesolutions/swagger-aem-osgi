package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(
    val name: ConfigNodePropertyString? = null,
    val type: ConfigNodePropertyDropDown? = null,
    val importMode: ConfigNodePropertyString? = null,
    val aclHandling: ConfigNodePropertyString? = null,
    val packageRoots: ConfigNodePropertyString? = null,
    val packageFilters: ConfigNodePropertyArray? = null,
    val propertyFilters: ConfigNodePropertyArray? = null,
    val tempFsFolder: ConfigNodePropertyString? = null,
    val useBinaryReferences: ConfigNodePropertyBoolean? = null,
    val autoSaveThreshold: ConfigNodePropertyInteger? = null,
    val cleanupDelay: ConfigNodePropertyInteger? = null,
    val fileThreshold: ConfigNodePropertyInteger? = null,
    val MEGA_BYTES: ConfigNodePropertyDropDown? = null,
    val useOffHeapMemory: ConfigNodePropertyBoolean? = null,
    val digestAlgorithm: ConfigNodePropertyDropDown? = null,
    val monitoringQueueSize: ConfigNodePropertyInteger? = null,
    val pathsMapping: ConfigNodePropertyArray? = null,
    val strictImport: ConfigNodePropertyBoolean? = null
)
