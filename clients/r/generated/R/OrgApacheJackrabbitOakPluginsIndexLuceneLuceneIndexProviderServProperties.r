# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties Class
#'
#' @field disabled 
#' @field debug 
#' @field localIndexDir 
#' @field enableOpenIndexAsync 
#' @field threadPoolSize 
#' @field prefetchIndexFiles 
#' @field extractedTextCacheSizeInMB 
#' @field extractedTextCacheExpiryInSecs 
#' @field alwaysUsePreExtractedCache 
#' @field booleanClauseLimit 
#' @field enableHybridIndexing 
#' @field hybridQueueSize 
#' @field disableStoredIndexDefinition 
#' @field deletedBlobsCollectionEnabled 
#' @field propIndexCleanerIntervalInSecs 
#' @field enableSingleBlobIndexFiles 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties <- R6::R6Class(
  'OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties',
  public = list(
    `disabled` = NULL,
    `debug` = NULL,
    `localIndexDir` = NULL,
    `enableOpenIndexAsync` = NULL,
    `threadPoolSize` = NULL,
    `prefetchIndexFiles` = NULL,
    `extractedTextCacheSizeInMB` = NULL,
    `extractedTextCacheExpiryInSecs` = NULL,
    `alwaysUsePreExtractedCache` = NULL,
    `booleanClauseLimit` = NULL,
    `enableHybridIndexing` = NULL,
    `hybridQueueSize` = NULL,
    `disableStoredIndexDefinition` = NULL,
    `deletedBlobsCollectionEnabled` = NULL,
    `propIndexCleanerIntervalInSecs` = NULL,
    `enableSingleBlobIndexFiles` = NULL,
    initialize = function(`disabled`, `debug`, `localIndexDir`, `enableOpenIndexAsync`, `threadPoolSize`, `prefetchIndexFiles`, `extractedTextCacheSizeInMB`, `extractedTextCacheExpiryInSecs`, `alwaysUsePreExtractedCache`, `booleanClauseLimit`, `enableHybridIndexing`, `hybridQueueSize`, `disableStoredIndexDefinition`, `deletedBlobsCollectionEnabled`, `propIndexCleanerIntervalInSecs`, `enableSingleBlobIndexFiles`){
      if (!missing(`disabled`)) {
        stopifnot(R6::is.R6(`disabled`))
        self$`disabled` <- `disabled`
      }
      if (!missing(`debug`)) {
        stopifnot(R6::is.R6(`debug`))
        self$`debug` <- `debug`
      }
      if (!missing(`localIndexDir`)) {
        stopifnot(R6::is.R6(`localIndexDir`))
        self$`localIndexDir` <- `localIndexDir`
      }
      if (!missing(`enableOpenIndexAsync`)) {
        stopifnot(R6::is.R6(`enableOpenIndexAsync`))
        self$`enableOpenIndexAsync` <- `enableOpenIndexAsync`
      }
      if (!missing(`threadPoolSize`)) {
        stopifnot(R6::is.R6(`threadPoolSize`))
        self$`threadPoolSize` <- `threadPoolSize`
      }
      if (!missing(`prefetchIndexFiles`)) {
        stopifnot(R6::is.R6(`prefetchIndexFiles`))
        self$`prefetchIndexFiles` <- `prefetchIndexFiles`
      }
      if (!missing(`extractedTextCacheSizeInMB`)) {
        stopifnot(R6::is.R6(`extractedTextCacheSizeInMB`))
        self$`extractedTextCacheSizeInMB` <- `extractedTextCacheSizeInMB`
      }
      if (!missing(`extractedTextCacheExpiryInSecs`)) {
        stopifnot(R6::is.R6(`extractedTextCacheExpiryInSecs`))
        self$`extractedTextCacheExpiryInSecs` <- `extractedTextCacheExpiryInSecs`
      }
      if (!missing(`alwaysUsePreExtractedCache`)) {
        stopifnot(R6::is.R6(`alwaysUsePreExtractedCache`))
        self$`alwaysUsePreExtractedCache` <- `alwaysUsePreExtractedCache`
      }
      if (!missing(`booleanClauseLimit`)) {
        stopifnot(R6::is.R6(`booleanClauseLimit`))
        self$`booleanClauseLimit` <- `booleanClauseLimit`
      }
      if (!missing(`enableHybridIndexing`)) {
        stopifnot(R6::is.R6(`enableHybridIndexing`))
        self$`enableHybridIndexing` <- `enableHybridIndexing`
      }
      if (!missing(`hybridQueueSize`)) {
        stopifnot(R6::is.R6(`hybridQueueSize`))
        self$`hybridQueueSize` <- `hybridQueueSize`
      }
      if (!missing(`disableStoredIndexDefinition`)) {
        stopifnot(R6::is.R6(`disableStoredIndexDefinition`))
        self$`disableStoredIndexDefinition` <- `disableStoredIndexDefinition`
      }
      if (!missing(`deletedBlobsCollectionEnabled`)) {
        stopifnot(R6::is.R6(`deletedBlobsCollectionEnabled`))
        self$`deletedBlobsCollectionEnabled` <- `deletedBlobsCollectionEnabled`
      }
      if (!missing(`propIndexCleanerIntervalInSecs`)) {
        stopifnot(R6::is.R6(`propIndexCleanerIntervalInSecs`))
        self$`propIndexCleanerIntervalInSecs` <- `propIndexCleanerIntervalInSecs`
      }
      if (!missing(`enableSingleBlobIndexFiles`)) {
        stopifnot(R6::is.R6(`enableSingleBlobIndexFiles`))
        self$`enableSingleBlobIndexFiles` <- `enableSingleBlobIndexFiles`
      }
    },
    toJSON = function() {
      OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject <- list()
      if (!is.null(self$`disabled`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['disabled']] <- self$`disabled`$toJSON()
      }
      if (!is.null(self$`debug`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['debug']] <- self$`debug`$toJSON()
      }
      if (!is.null(self$`localIndexDir`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['localIndexDir']] <- self$`localIndexDir`$toJSON()
      }
      if (!is.null(self$`enableOpenIndexAsync`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['enableOpenIndexAsync']] <- self$`enableOpenIndexAsync`$toJSON()
      }
      if (!is.null(self$`threadPoolSize`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['threadPoolSize']] <- self$`threadPoolSize`$toJSON()
      }
      if (!is.null(self$`prefetchIndexFiles`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['prefetchIndexFiles']] <- self$`prefetchIndexFiles`$toJSON()
      }
      if (!is.null(self$`extractedTextCacheSizeInMB`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['extractedTextCacheSizeInMB']] <- self$`extractedTextCacheSizeInMB`$toJSON()
      }
      if (!is.null(self$`extractedTextCacheExpiryInSecs`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['extractedTextCacheExpiryInSecs']] <- self$`extractedTextCacheExpiryInSecs`$toJSON()
      }
      if (!is.null(self$`alwaysUsePreExtractedCache`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['alwaysUsePreExtractedCache']] <- self$`alwaysUsePreExtractedCache`$toJSON()
      }
      if (!is.null(self$`booleanClauseLimit`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['booleanClauseLimit']] <- self$`booleanClauseLimit`$toJSON()
      }
      if (!is.null(self$`enableHybridIndexing`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['enableHybridIndexing']] <- self$`enableHybridIndexing`$toJSON()
      }
      if (!is.null(self$`hybridQueueSize`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['hybridQueueSize']] <- self$`hybridQueueSize`$toJSON()
      }
      if (!is.null(self$`disableStoredIndexDefinition`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['disableStoredIndexDefinition']] <- self$`disableStoredIndexDefinition`$toJSON()
      }
      if (!is.null(self$`deletedBlobsCollectionEnabled`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['deletedBlobsCollectionEnabled']] <- self$`deletedBlobsCollectionEnabled`$toJSON()
      }
      if (!is.null(self$`propIndexCleanerIntervalInSecs`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['propIndexCleanerIntervalInSecs']] <- self$`propIndexCleanerIntervalInSecs`$toJSON()
      }
      if (!is.null(self$`enableSingleBlobIndexFiles`)) {
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject[['enableSingleBlobIndexFiles']] <- self$`enableSingleBlobIndexFiles`$toJSON()
      }

      OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject
    },
    fromJSON = function(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesJson) {
      OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject <- jsonlite::fromJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesJson)
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`disabled`)) {
        disabledObject <- ConfigNodePropertyBoolean$new()
        disabledObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$disabled, auto_unbox = TRUE))
        self$`disabled` <- disabledObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`debug`)) {
        debugObject <- ConfigNodePropertyBoolean$new()
        debugObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$debug, auto_unbox = TRUE))
        self$`debug` <- debugObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`localIndexDir`)) {
        localIndexDirObject <- ConfigNodePropertyString$new()
        localIndexDirObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$localIndexDir, auto_unbox = TRUE))
        self$`localIndexDir` <- localIndexDirObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`enableOpenIndexAsync`)) {
        enableOpenIndexAsyncObject <- ConfigNodePropertyBoolean$new()
        enableOpenIndexAsyncObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$enableOpenIndexAsync, auto_unbox = TRUE))
        self$`enableOpenIndexAsync` <- enableOpenIndexAsyncObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`threadPoolSize`)) {
        threadPoolSizeObject <- ConfigNodePropertyInteger$new()
        threadPoolSizeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$threadPoolSize, auto_unbox = TRUE))
        self$`threadPoolSize` <- threadPoolSizeObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`prefetchIndexFiles`)) {
        prefetchIndexFilesObject <- ConfigNodePropertyBoolean$new()
        prefetchIndexFilesObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$prefetchIndexFiles, auto_unbox = TRUE))
        self$`prefetchIndexFiles` <- prefetchIndexFilesObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`extractedTextCacheSizeInMB`)) {
        extractedTextCacheSizeInMBObject <- ConfigNodePropertyInteger$new()
        extractedTextCacheSizeInMBObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$extractedTextCacheSizeInMB, auto_unbox = TRUE))
        self$`extractedTextCacheSizeInMB` <- extractedTextCacheSizeInMBObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`extractedTextCacheExpiryInSecs`)) {
        extractedTextCacheExpiryInSecsObject <- ConfigNodePropertyInteger$new()
        extractedTextCacheExpiryInSecsObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$extractedTextCacheExpiryInSecs, auto_unbox = TRUE))
        self$`extractedTextCacheExpiryInSecs` <- extractedTextCacheExpiryInSecsObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`alwaysUsePreExtractedCache`)) {
        alwaysUsePreExtractedCacheObject <- ConfigNodePropertyBoolean$new()
        alwaysUsePreExtractedCacheObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$alwaysUsePreExtractedCache, auto_unbox = TRUE))
        self$`alwaysUsePreExtractedCache` <- alwaysUsePreExtractedCacheObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`booleanClauseLimit`)) {
        booleanClauseLimitObject <- ConfigNodePropertyInteger$new()
        booleanClauseLimitObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$booleanClauseLimit, auto_unbox = TRUE))
        self$`booleanClauseLimit` <- booleanClauseLimitObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`enableHybridIndexing`)) {
        enableHybridIndexingObject <- ConfigNodePropertyBoolean$new()
        enableHybridIndexingObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$enableHybridIndexing, auto_unbox = TRUE))
        self$`enableHybridIndexing` <- enableHybridIndexingObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`hybridQueueSize`)) {
        hybridQueueSizeObject <- ConfigNodePropertyInteger$new()
        hybridQueueSizeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$hybridQueueSize, auto_unbox = TRUE))
        self$`hybridQueueSize` <- hybridQueueSizeObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`disableStoredIndexDefinition`)) {
        disableStoredIndexDefinitionObject <- ConfigNodePropertyBoolean$new()
        disableStoredIndexDefinitionObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$disableStoredIndexDefinition, auto_unbox = TRUE))
        self$`disableStoredIndexDefinition` <- disableStoredIndexDefinitionObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`deletedBlobsCollectionEnabled`)) {
        deletedBlobsCollectionEnabledObject <- ConfigNodePropertyBoolean$new()
        deletedBlobsCollectionEnabledObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$deletedBlobsCollectionEnabled, auto_unbox = TRUE))
        self$`deletedBlobsCollectionEnabled` <- deletedBlobsCollectionEnabledObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`propIndexCleanerIntervalInSecs`)) {
        propIndexCleanerIntervalInSecsObject <- ConfigNodePropertyInteger$new()
        propIndexCleanerIntervalInSecsObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$propIndexCleanerIntervalInSecs, auto_unbox = TRUE))
        self$`propIndexCleanerIntervalInSecs` <- propIndexCleanerIntervalInSecsObject
      }
      if (!is.null(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$`enableSingleBlobIndexFiles`)) {
        enableSingleBlobIndexFilesObject <- ConfigNodePropertyBoolean$new()
        enableSingleBlobIndexFilesObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$enableSingleBlobIndexFiles, auto_unbox = TRUE))
        self$`enableSingleBlobIndexFiles` <- enableSingleBlobIndexFilesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "disabled": %s,
           "debug": %s,
           "localIndexDir": %s,
           "enableOpenIndexAsync": %s,
           "threadPoolSize": %s,
           "prefetchIndexFiles": %s,
           "extractedTextCacheSizeInMB": %s,
           "extractedTextCacheExpiryInSecs": %s,
           "alwaysUsePreExtractedCache": %s,
           "booleanClauseLimit": %s,
           "enableHybridIndexing": %s,
           "hybridQueueSize": %s,
           "disableStoredIndexDefinition": %s,
           "deletedBlobsCollectionEnabled": %s,
           "propIndexCleanerIntervalInSecs": %s,
           "enableSingleBlobIndexFiles": %s
        }',
        self$`disabled`$toJSON(),
        self$`debug`$toJSON(),
        self$`localIndexDir`$toJSON(),
        self$`enableOpenIndexAsync`$toJSON(),
        self$`threadPoolSize`$toJSON(),
        self$`prefetchIndexFiles`$toJSON(),
        self$`extractedTextCacheSizeInMB`$toJSON(),
        self$`extractedTextCacheExpiryInSecs`$toJSON(),
        self$`alwaysUsePreExtractedCache`$toJSON(),
        self$`booleanClauseLimit`$toJSON(),
        self$`enableHybridIndexing`$toJSON(),
        self$`hybridQueueSize`$toJSON(),
        self$`disableStoredIndexDefinition`$toJSON(),
        self$`deletedBlobsCollectionEnabled`$toJSON(),
        self$`propIndexCleanerIntervalInSecs`$toJSON(),
        self$`enableSingleBlobIndexFiles`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesJson) {
      OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject <- jsonlite::fromJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesJson)
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`disabled` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$disabled, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`debug` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$debug, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`localIndexDir` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$localIndexDir, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`enableOpenIndexAsync` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$enableOpenIndexAsync, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`threadPoolSize` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$threadPoolSize, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`prefetchIndexFiles` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$prefetchIndexFiles, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`extractedTextCacheSizeInMB` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$extractedTextCacheSizeInMB, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`extractedTextCacheExpiryInSecs` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$extractedTextCacheExpiryInSecs, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`alwaysUsePreExtractedCache` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$alwaysUsePreExtractedCache, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`booleanClauseLimit` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$booleanClauseLimit, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`enableHybridIndexing` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$enableHybridIndexing, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`hybridQueueSize` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$hybridQueueSize, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`disableStoredIndexDefinition` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$disableStoredIndexDefinition, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`deletedBlobsCollectionEnabled` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$deletedBlobsCollectionEnabled, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`propIndexCleanerIntervalInSecs` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$propIndexCleanerIntervalInSecs, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`enableSingleBlobIndexFiles` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesObject$enableSingleBlobIndexFiles, auto_unbox = TRUE))
    }
  )
)