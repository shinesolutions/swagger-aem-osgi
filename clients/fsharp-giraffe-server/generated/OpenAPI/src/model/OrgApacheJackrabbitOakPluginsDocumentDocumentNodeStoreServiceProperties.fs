namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties =

  //#region OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties


  type orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties = {
    Mongouri : ConfigNodePropertyString;
    Db : ConfigNodePropertyString;
    SocketKeepAlive : ConfigNodePropertyBoolean;
    Cache : ConfigNodePropertyInteger;
    NodeCachePercentage : ConfigNodePropertyInteger;
    PrevDocCachePercentage : ConfigNodePropertyInteger;
    ChildrenCachePercentage : ConfigNodePropertyInteger;
    DiffCachePercentage : ConfigNodePropertyInteger;
    CacheSegmentCount : ConfigNodePropertyInteger;
    CacheStackMoveDistance : ConfigNodePropertyInteger;
    BlobCacheSize : ConfigNodePropertyInteger;
    PersistentCache : ConfigNodePropertyString;
    JournalCache : ConfigNodePropertyString;
    CustomBlobStore : ConfigNodePropertyBoolean;
    JournalGCInterval : ConfigNodePropertyInteger;
    JournalGCMaxAge : ConfigNodePropertyInteger;
    PrefetchExternalChanges : ConfigNodePropertyBoolean;
    Role : ConfigNodePropertyString;
    VersionGcMaxAgeInSecs : ConfigNodePropertyInteger;
    VersionGCExpression : ConfigNodePropertyString;
    VersionGCTimeLimitInSecs : ConfigNodePropertyInteger;
    BlobGcMaxAgeInSecs : ConfigNodePropertyInteger;
    BlobTrackSnapshotIntervalInSecs : ConfigNodePropertyInteger;
    RepositoryHome : ConfigNodePropertyString;
    MaxReplicationLagInSecs : ConfigNodePropertyInteger;
    DocumentStoreType : ConfigNodePropertyDropDown;
    BundlingDisabled : ConfigNodePropertyBoolean;
    UpdateLimit : ConfigNodePropertyInteger;
    PersistentCacheIncludes : ConfigNodePropertyArray;
    LeaseCheckMode : ConfigNodePropertyDropDown;
  }
  //#endregion
