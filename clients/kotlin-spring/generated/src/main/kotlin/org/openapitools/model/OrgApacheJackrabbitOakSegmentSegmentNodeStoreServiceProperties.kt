package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param repositoryHome 
 * @param tarmkMode 
 * @param tarmkSize 
 * @param segmentCacheSize 
 * @param stringCacheSize 
 * @param templateCacheSize 
 * @param stringDeduplicationCacheSize 
 * @param templateDeduplicationCacheSize 
 * @param nodeDeduplicationCacheSize 
 * @param pauseCompaction 
 * @param compactionRetryCount 
 * @param compactionForceTimeout 
 * @param compactionSizeDeltaEstimation 
 * @param compactionDisableEstimation 
 * @param compactionRetainedGenerations 
 * @param compactionMemoryThreshold 
 * @param compactionProgressLog 
 * @param standby 
 * @param customBlobStore 
 * @param customSegmentStore 
 * @param splitPersistence 
 * @param repositoryBackupDir 
 * @param blobGcMaxAgeInSecs 
 * @param blobTrackSnapshotIntervalInSecs 
 */
data class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("repository.home")
    @get:JsonProperty("repository.home") val repositoryHome: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tarmk.mode")
    @get:JsonProperty("tarmk.mode") val tarmkMode: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tarmk.size")
    @get:JsonProperty("tarmk.size") val tarmkSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("segmentCache.size")
    @get:JsonProperty("segmentCache.size") val segmentCacheSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("stringCache.size")
    @get:JsonProperty("stringCache.size") val stringCacheSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("templateCache.size")
    @get:JsonProperty("templateCache.size") val templateCacheSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("stringDeduplicationCache.size")
    @get:JsonProperty("stringDeduplicationCache.size") val stringDeduplicationCacheSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("templateDeduplicationCache.size")
    @get:JsonProperty("templateDeduplicationCache.size") val templateDeduplicationCacheSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("nodeDeduplicationCache.size")
    @get:JsonProperty("nodeDeduplicationCache.size") val nodeDeduplicationCacheSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pauseCompaction")
    @get:JsonProperty("pauseCompaction") val pauseCompaction: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("compaction.retryCount")
    @get:JsonProperty("compaction.retryCount") val compactionRetryCount: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("compaction.force.timeout")
    @get:JsonProperty("compaction.force.timeout") val compactionForceTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("compaction.sizeDeltaEstimation")
    @get:JsonProperty("compaction.sizeDeltaEstimation") val compactionSizeDeltaEstimation: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("compaction.disableEstimation")
    @get:JsonProperty("compaction.disableEstimation") val compactionDisableEstimation: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("compaction.retainedGenerations")
    @get:JsonProperty("compaction.retainedGenerations") val compactionRetainedGenerations: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("compaction.memoryThreshold")
    @get:JsonProperty("compaction.memoryThreshold") val compactionMemoryThreshold: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("compaction.progressLog")
    @get:JsonProperty("compaction.progressLog") val compactionProgressLog: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("standby")
    @get:JsonProperty("standby") val standby: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("customBlobStore")
    @get:JsonProperty("customBlobStore") val customBlobStore: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("customSegmentStore")
    @get:JsonProperty("customSegmentStore") val customSegmentStore: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("splitPersistence")
    @get:JsonProperty("splitPersistence") val splitPersistence: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("repository.backup.dir")
    @get:JsonProperty("repository.backup.dir") val repositoryBackupDir: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("blobGcMaxAgeInSecs")
    @get:JsonProperty("blobGcMaxAgeInSecs") val blobGcMaxAgeInSecs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("blobTrackSnapshotIntervalInSecs")
    @get:JsonProperty("blobTrackSnapshotIntervalInSecs") val blobTrackSnapshotIntervalInSecs: ConfigNodePropertyInteger? = null
) {

}

