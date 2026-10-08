namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties = {
    [<JsonProperty(PropertyName = "disabled")>]
    Disabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "debug")>]
    Debug : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "localIndexDir")>]
    LocalIndexDir : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "enableOpenIndexAsync")>]
    EnableOpenIndexAsync : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "threadPoolSize")>]
    ThreadPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "prefetchIndexFiles")>]
    PrefetchIndexFiles : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "extractedTextCacheSizeInMB")>]
    ExtractedTextCacheSizeInMB : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "extractedTextCacheExpiryInSecs")>]
    ExtractedTextCacheExpiryInSecs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "alwaysUsePreExtractedCache")>]
    AlwaysUsePreExtractedCache : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "booleanClauseLimit")>]
    BooleanClauseLimit : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "enableHybridIndexing")>]
    EnableHybridIndexing : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "hybridQueueSize")>]
    HybridQueueSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "disableStoredIndexDefinition")>]
    DisableStoredIndexDefinition : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "deletedBlobsCollectionEnabled")>]
    DeletedBlobsCollectionEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "propIndexCleanerIntervalInSecs")>]
    PropIndexCleanerIntervalInSecs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "enableSingleBlobIndexFiles")>]
    EnableSingleBlobIndexFiles : ConfigNodePropertyBoolean;
  }

  //#endregion
