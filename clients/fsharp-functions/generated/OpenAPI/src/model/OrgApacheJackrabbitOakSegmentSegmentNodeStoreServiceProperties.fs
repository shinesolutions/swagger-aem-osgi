namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties =

  //#region OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties = {
    [<JsonProperty(PropertyName = "repository.home")>]
    RepositoryHome : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "tarmk.mode")>]
    TarmkMode : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "tarmk.size")>]
    TarmkSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "segmentCache.size")>]
    SegmentCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "stringCache.size")>]
    StringCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "templateCache.size")>]
    TemplateCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "stringDeduplicationCache.size")>]
    StringDeduplicationCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "templateDeduplicationCache.size")>]
    TemplateDeduplicationCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "nodeDeduplicationCache.size")>]
    NodeDeduplicationCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "pauseCompaction")>]
    PauseCompaction : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "compaction.retryCount")>]
    CompactionRetryCount : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "compaction.force.timeout")>]
    CompactionForceTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "compaction.sizeDeltaEstimation")>]
    CompactionSizeDeltaEstimation : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "compaction.disableEstimation")>]
    CompactionDisableEstimation : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "compaction.retainedGenerations")>]
    CompactionRetainedGenerations : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "compaction.memoryThreshold")>]
    CompactionMemoryThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "compaction.progressLog")>]
    CompactionProgressLog : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "standby")>]
    Standby : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "customBlobStore")>]
    CustomBlobStore : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "customSegmentStore")>]
    CustomSegmentStore : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "splitPersistence")>]
    SplitPersistence : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "repository.backup.dir")>]
    RepositoryBackupDir : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "blobGcMaxAgeInSecs")>]
    BlobGcMaxAgeInSecs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "blobTrackSnapshotIntervalInSecs")>]
    BlobTrackSnapshotIntervalInSecs : ConfigNodePropertyInteger;
  }

  //#endregion
