namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties =

  //#region OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties


  type orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties = {
    RepositoryHome : ConfigNodePropertyString;
    TarmkMode : ConfigNodePropertyString;
    TarmkSize : ConfigNodePropertyInteger;
    SegmentCacheSize : ConfigNodePropertyInteger;
    StringCacheSize : ConfigNodePropertyInteger;
    TemplateCacheSize : ConfigNodePropertyInteger;
    StringDeduplicationCacheSize : ConfigNodePropertyInteger;
    TemplateDeduplicationCacheSize : ConfigNodePropertyInteger;
    NodeDeduplicationCacheSize : ConfigNodePropertyInteger;
    PauseCompaction : ConfigNodePropertyBoolean;
    CompactionRetryCount : ConfigNodePropertyInteger;
    CompactionForceTimeout : ConfigNodePropertyInteger;
    CompactionSizeDeltaEstimation : ConfigNodePropertyInteger;
    CompactionDisableEstimation : ConfigNodePropertyBoolean;
    CompactionRetainedGenerations : ConfigNodePropertyInteger;
    CompactionMemoryThreshold : ConfigNodePropertyInteger;
    CompactionProgressLog : ConfigNodePropertyInteger;
    Standby : ConfigNodePropertyBoolean;
    CustomBlobStore : ConfigNodePropertyBoolean;
    CustomSegmentStore : ConfigNodePropertyBoolean;
    SplitPersistence : ConfigNodePropertyBoolean;
    RepositoryBackupDir : ConfigNodePropertyString;
    BlobGcMaxAgeInSecs : ConfigNodePropertyInteger;
    BlobTrackSnapshotIntervalInSecs : ConfigNodePropertyInteger;
    Role : ConfigNodePropertyString;
    RegisterDescriptors : ConfigNodePropertyBoolean;
    DispatchChanges : ConfigNodePropertyBoolean;
  }
  //#endregion
