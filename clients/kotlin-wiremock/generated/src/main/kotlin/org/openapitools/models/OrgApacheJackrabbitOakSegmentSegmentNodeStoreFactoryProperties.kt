@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties(
    @field:JsonProperty("repository.home")
    val repositoryHome: ConfigNodePropertyString? = null,

    @field:JsonProperty("tarmk.mode")
    val tarmkMode: ConfigNodePropertyString? = null,

    @field:JsonProperty("tarmk.size")
    val tarmkSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("segmentCache.size")
    val segmentCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("stringCache.size")
    val stringCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("templateCache.size")
    val templateCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("stringDeduplicationCache.size")
    val stringDeduplicationCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("templateDeduplicationCache.size")
    val templateDeduplicationCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("nodeDeduplicationCache.size")
    val nodeDeduplicationCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("pauseCompaction")
    val pauseCompaction: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("compaction.retryCount")
    val compactionRetryCount: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("compaction.force.timeout")
    val compactionForceTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("compaction.sizeDeltaEstimation")
    val compactionSizeDeltaEstimation: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("compaction.disableEstimation")
    val compactionDisableEstimation: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("compaction.retainedGenerations")
    val compactionRetainedGenerations: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("compaction.memoryThreshold")
    val compactionMemoryThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("compaction.progressLog")
    val compactionProgressLog: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("standby")
    val standby: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("customBlobStore")
    val customBlobStore: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("customSegmentStore")
    val customSegmentStore: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("splitPersistence")
    val splitPersistence: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("repository.backup.dir")
    val repositoryBackupDir: ConfigNodePropertyString? = null,

    @field:JsonProperty("blobGcMaxAgeInSecs")
    val blobGcMaxAgeInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("blobTrackSnapshotIntervalInSecs")
    val blobTrackSnapshotIntervalInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("role")
    val role: ConfigNodePropertyString? = null,

    @field:JsonProperty("registerDescriptors")
    val registerDescriptors: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("dispatchChanges")
    val dispatchChanges: ConfigNodePropertyBoolean? = null,

)
