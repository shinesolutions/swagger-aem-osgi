# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties Class
#'
#' @field repository.home 
#' @field tarmk.mode 
#' @field tarmk.size 
#' @field segmentCache.size 
#' @field stringCache.size 
#' @field templateCache.size 
#' @field stringDeduplicationCache.size 
#' @field templateDeduplicationCache.size 
#' @field nodeDeduplicationCache.size 
#' @field pauseCompaction 
#' @field compaction.retryCount 
#' @field compaction.force.timeout 
#' @field compaction.sizeDeltaEstimation 
#' @field compaction.disableEstimation 
#' @field compaction.retainedGenerations 
#' @field compaction.memoryThreshold 
#' @field compaction.progressLog 
#' @field standby 
#' @field customBlobStore 
#' @field customSegmentStore 
#' @field splitPersistence 
#' @field repository.backup.dir 
#' @field blobGcMaxAgeInSecs 
#' @field blobTrackSnapshotIntervalInSecs 
#' @field role 
#' @field registerDescriptors 
#' @field dispatchChanges 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties <- R6::R6Class(
  'OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties',
  public = list(
    `repository.home` = NULL,
    `tarmk.mode` = NULL,
    `tarmk.size` = NULL,
    `segmentCache.size` = NULL,
    `stringCache.size` = NULL,
    `templateCache.size` = NULL,
    `stringDeduplicationCache.size` = NULL,
    `templateDeduplicationCache.size` = NULL,
    `nodeDeduplicationCache.size` = NULL,
    `pauseCompaction` = NULL,
    `compaction.retryCount` = NULL,
    `compaction.force.timeout` = NULL,
    `compaction.sizeDeltaEstimation` = NULL,
    `compaction.disableEstimation` = NULL,
    `compaction.retainedGenerations` = NULL,
    `compaction.memoryThreshold` = NULL,
    `compaction.progressLog` = NULL,
    `standby` = NULL,
    `customBlobStore` = NULL,
    `customSegmentStore` = NULL,
    `splitPersistence` = NULL,
    `repository.backup.dir` = NULL,
    `blobGcMaxAgeInSecs` = NULL,
    `blobTrackSnapshotIntervalInSecs` = NULL,
    `role` = NULL,
    `registerDescriptors` = NULL,
    `dispatchChanges` = NULL,
    initialize = function(`repository.home`, `tarmk.mode`, `tarmk.size`, `segmentCache.size`, `stringCache.size`, `templateCache.size`, `stringDeduplicationCache.size`, `templateDeduplicationCache.size`, `nodeDeduplicationCache.size`, `pauseCompaction`, `compaction.retryCount`, `compaction.force.timeout`, `compaction.sizeDeltaEstimation`, `compaction.disableEstimation`, `compaction.retainedGenerations`, `compaction.memoryThreshold`, `compaction.progressLog`, `standby`, `customBlobStore`, `customSegmentStore`, `splitPersistence`, `repository.backup.dir`, `blobGcMaxAgeInSecs`, `blobTrackSnapshotIntervalInSecs`, `role`, `registerDescriptors`, `dispatchChanges`){
      if (!missing(`repository.home`)) {
        stopifnot(R6::is.R6(`repository.home`))
        self$`repository.home` <- `repository.home`
      }
      if (!missing(`tarmk.mode`)) {
        stopifnot(R6::is.R6(`tarmk.mode`))
        self$`tarmk.mode` <- `tarmk.mode`
      }
      if (!missing(`tarmk.size`)) {
        stopifnot(R6::is.R6(`tarmk.size`))
        self$`tarmk.size` <- `tarmk.size`
      }
      if (!missing(`segmentCache.size`)) {
        stopifnot(R6::is.R6(`segmentCache.size`))
        self$`segmentCache.size` <- `segmentCache.size`
      }
      if (!missing(`stringCache.size`)) {
        stopifnot(R6::is.R6(`stringCache.size`))
        self$`stringCache.size` <- `stringCache.size`
      }
      if (!missing(`templateCache.size`)) {
        stopifnot(R6::is.R6(`templateCache.size`))
        self$`templateCache.size` <- `templateCache.size`
      }
      if (!missing(`stringDeduplicationCache.size`)) {
        stopifnot(R6::is.R6(`stringDeduplicationCache.size`))
        self$`stringDeduplicationCache.size` <- `stringDeduplicationCache.size`
      }
      if (!missing(`templateDeduplicationCache.size`)) {
        stopifnot(R6::is.R6(`templateDeduplicationCache.size`))
        self$`templateDeduplicationCache.size` <- `templateDeduplicationCache.size`
      }
      if (!missing(`nodeDeduplicationCache.size`)) {
        stopifnot(R6::is.R6(`nodeDeduplicationCache.size`))
        self$`nodeDeduplicationCache.size` <- `nodeDeduplicationCache.size`
      }
      if (!missing(`pauseCompaction`)) {
        stopifnot(R6::is.R6(`pauseCompaction`))
        self$`pauseCompaction` <- `pauseCompaction`
      }
      if (!missing(`compaction.retryCount`)) {
        stopifnot(R6::is.R6(`compaction.retryCount`))
        self$`compaction.retryCount` <- `compaction.retryCount`
      }
      if (!missing(`compaction.force.timeout`)) {
        stopifnot(R6::is.R6(`compaction.force.timeout`))
        self$`compaction.force.timeout` <- `compaction.force.timeout`
      }
      if (!missing(`compaction.sizeDeltaEstimation`)) {
        stopifnot(R6::is.R6(`compaction.sizeDeltaEstimation`))
        self$`compaction.sizeDeltaEstimation` <- `compaction.sizeDeltaEstimation`
      }
      if (!missing(`compaction.disableEstimation`)) {
        stopifnot(R6::is.R6(`compaction.disableEstimation`))
        self$`compaction.disableEstimation` <- `compaction.disableEstimation`
      }
      if (!missing(`compaction.retainedGenerations`)) {
        stopifnot(R6::is.R6(`compaction.retainedGenerations`))
        self$`compaction.retainedGenerations` <- `compaction.retainedGenerations`
      }
      if (!missing(`compaction.memoryThreshold`)) {
        stopifnot(R6::is.R6(`compaction.memoryThreshold`))
        self$`compaction.memoryThreshold` <- `compaction.memoryThreshold`
      }
      if (!missing(`compaction.progressLog`)) {
        stopifnot(R6::is.R6(`compaction.progressLog`))
        self$`compaction.progressLog` <- `compaction.progressLog`
      }
      if (!missing(`standby`)) {
        stopifnot(R6::is.R6(`standby`))
        self$`standby` <- `standby`
      }
      if (!missing(`customBlobStore`)) {
        stopifnot(R6::is.R6(`customBlobStore`))
        self$`customBlobStore` <- `customBlobStore`
      }
      if (!missing(`customSegmentStore`)) {
        stopifnot(R6::is.R6(`customSegmentStore`))
        self$`customSegmentStore` <- `customSegmentStore`
      }
      if (!missing(`splitPersistence`)) {
        stopifnot(R6::is.R6(`splitPersistence`))
        self$`splitPersistence` <- `splitPersistence`
      }
      if (!missing(`repository.backup.dir`)) {
        stopifnot(R6::is.R6(`repository.backup.dir`))
        self$`repository.backup.dir` <- `repository.backup.dir`
      }
      if (!missing(`blobGcMaxAgeInSecs`)) {
        stopifnot(R6::is.R6(`blobGcMaxAgeInSecs`))
        self$`blobGcMaxAgeInSecs` <- `blobGcMaxAgeInSecs`
      }
      if (!missing(`blobTrackSnapshotIntervalInSecs`)) {
        stopifnot(R6::is.R6(`blobTrackSnapshotIntervalInSecs`))
        self$`blobTrackSnapshotIntervalInSecs` <- `blobTrackSnapshotIntervalInSecs`
      }
      if (!missing(`role`)) {
        stopifnot(R6::is.R6(`role`))
        self$`role` <- `role`
      }
      if (!missing(`registerDescriptors`)) {
        stopifnot(R6::is.R6(`registerDescriptors`))
        self$`registerDescriptors` <- `registerDescriptors`
      }
      if (!missing(`dispatchChanges`)) {
        stopifnot(R6::is.R6(`dispatchChanges`))
        self$`dispatchChanges` <- `dispatchChanges`
      }
    },
    toJSON = function() {
      OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject <- list()
      if (!is.null(self$`repository.home`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['repository.home']] <- self$`repository.home`$toJSON()
      }
      if (!is.null(self$`tarmk.mode`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['tarmk.mode']] <- self$`tarmk.mode`$toJSON()
      }
      if (!is.null(self$`tarmk.size`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['tarmk.size']] <- self$`tarmk.size`$toJSON()
      }
      if (!is.null(self$`segmentCache.size`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['segmentCache.size']] <- self$`segmentCache.size`$toJSON()
      }
      if (!is.null(self$`stringCache.size`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['stringCache.size']] <- self$`stringCache.size`$toJSON()
      }
      if (!is.null(self$`templateCache.size`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['templateCache.size']] <- self$`templateCache.size`$toJSON()
      }
      if (!is.null(self$`stringDeduplicationCache.size`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['stringDeduplicationCache.size']] <- self$`stringDeduplicationCache.size`$toJSON()
      }
      if (!is.null(self$`templateDeduplicationCache.size`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['templateDeduplicationCache.size']] <- self$`templateDeduplicationCache.size`$toJSON()
      }
      if (!is.null(self$`nodeDeduplicationCache.size`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['nodeDeduplicationCache.size']] <- self$`nodeDeduplicationCache.size`$toJSON()
      }
      if (!is.null(self$`pauseCompaction`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['pauseCompaction']] <- self$`pauseCompaction`$toJSON()
      }
      if (!is.null(self$`compaction.retryCount`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['compaction.retryCount']] <- self$`compaction.retryCount`$toJSON()
      }
      if (!is.null(self$`compaction.force.timeout`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['compaction.force.timeout']] <- self$`compaction.force.timeout`$toJSON()
      }
      if (!is.null(self$`compaction.sizeDeltaEstimation`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['compaction.sizeDeltaEstimation']] <- self$`compaction.sizeDeltaEstimation`$toJSON()
      }
      if (!is.null(self$`compaction.disableEstimation`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['compaction.disableEstimation']] <- self$`compaction.disableEstimation`$toJSON()
      }
      if (!is.null(self$`compaction.retainedGenerations`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['compaction.retainedGenerations']] <- self$`compaction.retainedGenerations`$toJSON()
      }
      if (!is.null(self$`compaction.memoryThreshold`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['compaction.memoryThreshold']] <- self$`compaction.memoryThreshold`$toJSON()
      }
      if (!is.null(self$`compaction.progressLog`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['compaction.progressLog']] <- self$`compaction.progressLog`$toJSON()
      }
      if (!is.null(self$`standby`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['standby']] <- self$`standby`$toJSON()
      }
      if (!is.null(self$`customBlobStore`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['customBlobStore']] <- self$`customBlobStore`$toJSON()
      }
      if (!is.null(self$`customSegmentStore`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['customSegmentStore']] <- self$`customSegmentStore`$toJSON()
      }
      if (!is.null(self$`splitPersistence`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['splitPersistence']] <- self$`splitPersistence`$toJSON()
      }
      if (!is.null(self$`repository.backup.dir`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['repository.backup.dir']] <- self$`repository.backup.dir`$toJSON()
      }
      if (!is.null(self$`blobGcMaxAgeInSecs`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['blobGcMaxAgeInSecs']] <- self$`blobGcMaxAgeInSecs`$toJSON()
      }
      if (!is.null(self$`blobTrackSnapshotIntervalInSecs`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['blobTrackSnapshotIntervalInSecs']] <- self$`blobTrackSnapshotIntervalInSecs`$toJSON()
      }
      if (!is.null(self$`role`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['role']] <- self$`role`$toJSON()
      }
      if (!is.null(self$`registerDescriptors`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['registerDescriptors']] <- self$`registerDescriptors`$toJSON()
      }
      if (!is.null(self$`dispatchChanges`)) {
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject[['dispatchChanges']] <- self$`dispatchChanges`$toJSON()
      }

      OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject
    },
    fromJSON = function(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesJson) {
      OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject <- jsonlite::fromJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesJson)
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`repository.home`)) {
        repository.homeObject <- ConfigNodePropertyString$new()
        repository.homeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$repository.home, auto_unbox = TRUE))
        self$`repository.home` <- repository.homeObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`tarmk.mode`)) {
        tarmk.modeObject <- ConfigNodePropertyString$new()
        tarmk.modeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$tarmk.mode, auto_unbox = TRUE))
        self$`tarmk.mode` <- tarmk.modeObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`tarmk.size`)) {
        tarmk.sizeObject <- ConfigNodePropertyInteger$new()
        tarmk.sizeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$tarmk.size, auto_unbox = TRUE))
        self$`tarmk.size` <- tarmk.sizeObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`segmentCache.size`)) {
        segmentCache.sizeObject <- ConfigNodePropertyInteger$new()
        segmentCache.sizeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$segmentCache.size, auto_unbox = TRUE))
        self$`segmentCache.size` <- segmentCache.sizeObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`stringCache.size`)) {
        stringCache.sizeObject <- ConfigNodePropertyInteger$new()
        stringCache.sizeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$stringCache.size, auto_unbox = TRUE))
        self$`stringCache.size` <- stringCache.sizeObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`templateCache.size`)) {
        templateCache.sizeObject <- ConfigNodePropertyInteger$new()
        templateCache.sizeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$templateCache.size, auto_unbox = TRUE))
        self$`templateCache.size` <- templateCache.sizeObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`stringDeduplicationCache.size`)) {
        stringDeduplicationCache.sizeObject <- ConfigNodePropertyInteger$new()
        stringDeduplicationCache.sizeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$stringDeduplicationCache.size, auto_unbox = TRUE))
        self$`stringDeduplicationCache.size` <- stringDeduplicationCache.sizeObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`templateDeduplicationCache.size`)) {
        templateDeduplicationCache.sizeObject <- ConfigNodePropertyInteger$new()
        templateDeduplicationCache.sizeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$templateDeduplicationCache.size, auto_unbox = TRUE))
        self$`templateDeduplicationCache.size` <- templateDeduplicationCache.sizeObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`nodeDeduplicationCache.size`)) {
        nodeDeduplicationCache.sizeObject <- ConfigNodePropertyInteger$new()
        nodeDeduplicationCache.sizeObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$nodeDeduplicationCache.size, auto_unbox = TRUE))
        self$`nodeDeduplicationCache.size` <- nodeDeduplicationCache.sizeObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`pauseCompaction`)) {
        pauseCompactionObject <- ConfigNodePropertyBoolean$new()
        pauseCompactionObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$pauseCompaction, auto_unbox = TRUE))
        self$`pauseCompaction` <- pauseCompactionObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`compaction.retryCount`)) {
        compaction.retryCountObject <- ConfigNodePropertyInteger$new()
        compaction.retryCountObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.retryCount, auto_unbox = TRUE))
        self$`compaction.retryCount` <- compaction.retryCountObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`compaction.force.timeout`)) {
        compaction.force.timeoutObject <- ConfigNodePropertyInteger$new()
        compaction.force.timeoutObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.force.timeout, auto_unbox = TRUE))
        self$`compaction.force.timeout` <- compaction.force.timeoutObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`compaction.sizeDeltaEstimation`)) {
        compaction.sizeDeltaEstimationObject <- ConfigNodePropertyInteger$new()
        compaction.sizeDeltaEstimationObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.sizeDeltaEstimation, auto_unbox = TRUE))
        self$`compaction.sizeDeltaEstimation` <- compaction.sizeDeltaEstimationObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`compaction.disableEstimation`)) {
        compaction.disableEstimationObject <- ConfigNodePropertyBoolean$new()
        compaction.disableEstimationObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.disableEstimation, auto_unbox = TRUE))
        self$`compaction.disableEstimation` <- compaction.disableEstimationObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`compaction.retainedGenerations`)) {
        compaction.retainedGenerationsObject <- ConfigNodePropertyInteger$new()
        compaction.retainedGenerationsObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.retainedGenerations, auto_unbox = TRUE))
        self$`compaction.retainedGenerations` <- compaction.retainedGenerationsObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`compaction.memoryThreshold`)) {
        compaction.memoryThresholdObject <- ConfigNodePropertyInteger$new()
        compaction.memoryThresholdObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.memoryThreshold, auto_unbox = TRUE))
        self$`compaction.memoryThreshold` <- compaction.memoryThresholdObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`compaction.progressLog`)) {
        compaction.progressLogObject <- ConfigNodePropertyInteger$new()
        compaction.progressLogObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.progressLog, auto_unbox = TRUE))
        self$`compaction.progressLog` <- compaction.progressLogObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`standby`)) {
        standbyObject <- ConfigNodePropertyBoolean$new()
        standbyObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$standby, auto_unbox = TRUE))
        self$`standby` <- standbyObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`customBlobStore`)) {
        customBlobStoreObject <- ConfigNodePropertyBoolean$new()
        customBlobStoreObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$customBlobStore, auto_unbox = TRUE))
        self$`customBlobStore` <- customBlobStoreObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`customSegmentStore`)) {
        customSegmentStoreObject <- ConfigNodePropertyBoolean$new()
        customSegmentStoreObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$customSegmentStore, auto_unbox = TRUE))
        self$`customSegmentStore` <- customSegmentStoreObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`splitPersistence`)) {
        splitPersistenceObject <- ConfigNodePropertyBoolean$new()
        splitPersistenceObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$splitPersistence, auto_unbox = TRUE))
        self$`splitPersistence` <- splitPersistenceObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`repository.backup.dir`)) {
        repository.backup.dirObject <- ConfigNodePropertyString$new()
        repository.backup.dirObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$repository.backup.dir, auto_unbox = TRUE))
        self$`repository.backup.dir` <- repository.backup.dirObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`blobGcMaxAgeInSecs`)) {
        blobGcMaxAgeInSecsObject <- ConfigNodePropertyInteger$new()
        blobGcMaxAgeInSecsObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$blobGcMaxAgeInSecs, auto_unbox = TRUE))
        self$`blobGcMaxAgeInSecs` <- blobGcMaxAgeInSecsObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`blobTrackSnapshotIntervalInSecs`)) {
        blobTrackSnapshotIntervalInSecsObject <- ConfigNodePropertyInteger$new()
        blobTrackSnapshotIntervalInSecsObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$blobTrackSnapshotIntervalInSecs, auto_unbox = TRUE))
        self$`blobTrackSnapshotIntervalInSecs` <- blobTrackSnapshotIntervalInSecsObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`role`)) {
        roleObject <- ConfigNodePropertyString$new()
        roleObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$role, auto_unbox = TRUE))
        self$`role` <- roleObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`registerDescriptors`)) {
        registerDescriptorsObject <- ConfigNodePropertyBoolean$new()
        registerDescriptorsObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$registerDescriptors, auto_unbox = TRUE))
        self$`registerDescriptors` <- registerDescriptorsObject
      }
      if (!is.null(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$`dispatchChanges`)) {
        dispatchChangesObject <- ConfigNodePropertyBoolean$new()
        dispatchChangesObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$dispatchChanges, auto_unbox = TRUE))
        self$`dispatchChanges` <- dispatchChangesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "repository.home": %s,
           "tarmk.mode": %s,
           "tarmk.size": %s,
           "segmentCache.size": %s,
           "stringCache.size": %s,
           "templateCache.size": %s,
           "stringDeduplicationCache.size": %s,
           "templateDeduplicationCache.size": %s,
           "nodeDeduplicationCache.size": %s,
           "pauseCompaction": %s,
           "compaction.retryCount": %s,
           "compaction.force.timeout": %s,
           "compaction.sizeDeltaEstimation": %s,
           "compaction.disableEstimation": %s,
           "compaction.retainedGenerations": %s,
           "compaction.memoryThreshold": %s,
           "compaction.progressLog": %s,
           "standby": %s,
           "customBlobStore": %s,
           "customSegmentStore": %s,
           "splitPersistence": %s,
           "repository.backup.dir": %s,
           "blobGcMaxAgeInSecs": %s,
           "blobTrackSnapshotIntervalInSecs": %s,
           "role": %s,
           "registerDescriptors": %s,
           "dispatchChanges": %s
        }',
        self$`repository.home`$toJSON(),
        self$`tarmk.mode`$toJSON(),
        self$`tarmk.size`$toJSON(),
        self$`segmentCache.size`$toJSON(),
        self$`stringCache.size`$toJSON(),
        self$`templateCache.size`$toJSON(),
        self$`stringDeduplicationCache.size`$toJSON(),
        self$`templateDeduplicationCache.size`$toJSON(),
        self$`nodeDeduplicationCache.size`$toJSON(),
        self$`pauseCompaction`$toJSON(),
        self$`compaction.retryCount`$toJSON(),
        self$`compaction.force.timeout`$toJSON(),
        self$`compaction.sizeDeltaEstimation`$toJSON(),
        self$`compaction.disableEstimation`$toJSON(),
        self$`compaction.retainedGenerations`$toJSON(),
        self$`compaction.memoryThreshold`$toJSON(),
        self$`compaction.progressLog`$toJSON(),
        self$`standby`$toJSON(),
        self$`customBlobStore`$toJSON(),
        self$`customSegmentStore`$toJSON(),
        self$`splitPersistence`$toJSON(),
        self$`repository.backup.dir`$toJSON(),
        self$`blobGcMaxAgeInSecs`$toJSON(),
        self$`blobTrackSnapshotIntervalInSecs`$toJSON(),
        self$`role`$toJSON(),
        self$`registerDescriptors`$toJSON(),
        self$`dispatchChanges`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesJson) {
      OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject <- jsonlite::fromJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`repository.home` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$repository.home, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`tarmk.mode` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$tarmk.mode, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`tarmk.size` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$tarmk.size, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`segmentCache.size` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$segmentCache.size, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`stringCache.size` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$stringCache.size, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`templateCache.size` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$templateCache.size, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`stringDeduplicationCache.size` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$stringDeduplicationCache.size, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`templateDeduplicationCache.size` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$templateDeduplicationCache.size, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`nodeDeduplicationCache.size` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$nodeDeduplicationCache.size, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`pauseCompaction` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$pauseCompaction, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`compaction.retryCount` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.retryCount, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`compaction.force.timeout` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.force.timeout, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`compaction.sizeDeltaEstimation` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.sizeDeltaEstimation, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`compaction.disableEstimation` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.disableEstimation, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`compaction.retainedGenerations` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.retainedGenerations, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`compaction.memoryThreshold` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.memoryThreshold, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`compaction.progressLog` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$compaction.progressLog, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`standby` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$standby, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`customBlobStore` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$customBlobStore, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`customSegmentStore` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$customSegmentStore, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`splitPersistence` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$splitPersistence, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`repository.backup.dir` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$repository.backup.dir, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`blobGcMaxAgeInSecs` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$blobGcMaxAgeInSecs, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`blobTrackSnapshotIntervalInSecs` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$blobTrackSnapshotIntervalInSecs, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`role` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$role, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`registerDescriptors` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$registerDescriptors, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`dispatchChanges` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesObject$dispatchChanges, auto_unbox = TRUE))
    }
  )
)