package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties(
    val repositoryHome: ConfigNodePropertyString? = null,
    val tarmkMode: ConfigNodePropertyString? = null,
    val tarmkSize: ConfigNodePropertyInteger? = null,
    val segmentCacheSize: ConfigNodePropertyInteger? = null,
    val stringCacheSize: ConfigNodePropertyInteger? = null,
    val templateCacheSize: ConfigNodePropertyInteger? = null,
    val stringDeduplicationCacheSize: ConfigNodePropertyInteger? = null,
    val templateDeduplicationCacheSize: ConfigNodePropertyInteger? = null,
    val nodeDeduplicationCacheSize: ConfigNodePropertyInteger? = null,
    val pauseCompaction: ConfigNodePropertyBoolean? = null,
    val compactionRetryCount: ConfigNodePropertyInteger? = null,
    val compactionForceTimeout: ConfigNodePropertyInteger? = null,
    val compactionSizeDeltaEstimation: ConfigNodePropertyInteger? = null,
    val compactionDisableEstimation: ConfigNodePropertyBoolean? = null,
    val compactionRetainedGenerations: ConfigNodePropertyInteger? = null,
    val compactionMemoryThreshold: ConfigNodePropertyInteger? = null,
    val compactionProgressLog: ConfigNodePropertyInteger? = null,
    val standby: ConfigNodePropertyBoolean? = null,
    val customBlobStore: ConfigNodePropertyBoolean? = null,
    val customSegmentStore: ConfigNodePropertyBoolean? = null,
    val splitPersistence: ConfigNodePropertyBoolean? = null,
    val repositoryBackupDir: ConfigNodePropertyString? = null,
    val blobGcMaxAgeInSecs: ConfigNodePropertyInteger? = null,
    val blobTrackSnapshotIntervalInSecs: ConfigNodePropertyInteger? = null,
    val role: ConfigNodePropertyString? = null,
    val registerDescriptors: ConfigNodePropertyBoolean? = null,
    val dispatchChanges: ConfigNodePropertyBoolean? = null
)
