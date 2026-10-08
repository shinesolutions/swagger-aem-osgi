namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties =

  //#region OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties = {
    [<JsonProperty(PropertyName = "mongouri")>]
    Mongouri : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "db")>]
    Db : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "socketKeepAlive")>]
    SocketKeepAlive : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cache")>]
    Cache : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "nodeCachePercentage")>]
    NodeCachePercentage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "prevDocCachePercentage")>]
    PrevDocCachePercentage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "childrenCachePercentage")>]
    ChildrenCachePercentage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "diffCachePercentage")>]
    DiffCachePercentage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cacheSegmentCount")>]
    CacheSegmentCount : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cacheStackMoveDistance")>]
    CacheStackMoveDistance : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "blobCacheSize")>]
    BlobCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "persistentCache")>]
    PersistentCache : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "journalCache")>]
    JournalCache : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "customBlobStore")>]
    CustomBlobStore : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "journalGCInterval")>]
    JournalGCInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "journalGCMaxAge")>]
    JournalGCMaxAge : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "prefetchExternalChanges")>]
    PrefetchExternalChanges : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "role")>]
    Role : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "versionGcMaxAgeInSecs")>]
    VersionGcMaxAgeInSecs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "versionGCExpression")>]
    VersionGCExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "versionGCTimeLimitInSecs")>]
    VersionGCTimeLimitInSecs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "blobGcMaxAgeInSecs")>]
    BlobGcMaxAgeInSecs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "blobTrackSnapshotIntervalInSecs")>]
    BlobTrackSnapshotIntervalInSecs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "repository.home")>]
    RepositoryHome : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "maxReplicationLagInSecs")>]
    MaxReplicationLagInSecs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "documentStoreType")>]
    DocumentStoreType : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "bundlingDisabled")>]
    BundlingDisabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "updateLimit")>]
    UpdateLimit : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "persistentCacheIncludes")>]
    PersistentCacheIncludes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "leaseCheckMode")>]
    LeaseCheckMode : ConfigNodePropertyDropDown;
  }

  //#endregion
