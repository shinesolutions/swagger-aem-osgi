namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties


  type orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties = {
    Disabled : ConfigNodePropertyBoolean;
    Debug : ConfigNodePropertyBoolean;
    LocalIndexDir : ConfigNodePropertyString;
    EnableOpenIndexAsync : ConfigNodePropertyBoolean;
    ThreadPoolSize : ConfigNodePropertyInteger;
    PrefetchIndexFiles : ConfigNodePropertyBoolean;
    ExtractedTextCacheSizeInMB : ConfigNodePropertyInteger;
    ExtractedTextCacheExpiryInSecs : ConfigNodePropertyInteger;
    AlwaysUsePreExtractedCache : ConfigNodePropertyBoolean;
    BooleanClauseLimit : ConfigNodePropertyInteger;
    EnableHybridIndexing : ConfigNodePropertyBoolean;
    HybridQueueSize : ConfigNodePropertyInteger;
    DisableStoredIndexDefinition : ConfigNodePropertyBoolean;
    DeletedBlobsCollectionEnabled : ConfigNodePropertyBoolean;
    PropIndexCleanerIntervalInSecs : ConfigNodePropertyInteger;
    EnableSingleBlobIndexFiles : ConfigNodePropertyBoolean;
  }
  //#endregion
