# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties Class
#'
#' @field purgeCompleted 
#' @field completedAge 
#' @field purgeActive 
#' @field activeAge 
#' @field saveThreshold 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties <- R6::R6Class(
  'ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties',
  public = list(
    `purgeCompleted` = NULL,
    `completedAge` = NULL,
    `purgeActive` = NULL,
    `activeAge` = NULL,
    `saveThreshold` = NULL,
    initialize = function(`purgeCompleted`, `completedAge`, `purgeActive`, `activeAge`, `saveThreshold`){
      if (!missing(`purgeCompleted`)) {
        stopifnot(R6::is.R6(`purgeCompleted`))
        self$`purgeCompleted` <- `purgeCompleted`
      }
      if (!missing(`completedAge`)) {
        stopifnot(R6::is.R6(`completedAge`))
        self$`completedAge` <- `completedAge`
      }
      if (!missing(`purgeActive`)) {
        stopifnot(R6::is.R6(`purgeActive`))
        self$`purgeActive` <- `purgeActive`
      }
      if (!missing(`activeAge`)) {
        stopifnot(R6::is.R6(`activeAge`))
        self$`activeAge` <- `activeAge`
      }
      if (!missing(`saveThreshold`)) {
        stopifnot(R6::is.R6(`saveThreshold`))
        self$`saveThreshold` <- `saveThreshold`
      }
    },
    toJSON = function() {
      ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject <- list()
      if (!is.null(self$`purgeCompleted`)) {
        ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject[['purgeCompleted']] <- self$`purgeCompleted`$toJSON()
      }
      if (!is.null(self$`completedAge`)) {
        ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject[['completedAge']] <- self$`completedAge`$toJSON()
      }
      if (!is.null(self$`purgeActive`)) {
        ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject[['purgeActive']] <- self$`purgeActive`$toJSON()
      }
      if (!is.null(self$`activeAge`)) {
        ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject[['activeAge']] <- self$`activeAge`$toJSON()
      }
      if (!is.null(self$`saveThreshold`)) {
        ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject[['saveThreshold']] <- self$`saveThreshold`$toJSON()
      }

      ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject
    },
    fromJSON = function(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesJson) {
      ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesJson)
      if (!is.null(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$`purgeCompleted`)) {
        purgeCompletedObject <- ConfigNodePropertyBoolean$new()
        purgeCompletedObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$purgeCompleted, auto_unbox = TRUE))
        self$`purgeCompleted` <- purgeCompletedObject
      }
      if (!is.null(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$`completedAge`)) {
        completedAgeObject <- ConfigNodePropertyInteger$new()
        completedAgeObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$completedAge, auto_unbox = TRUE))
        self$`completedAge` <- completedAgeObject
      }
      if (!is.null(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$`purgeActive`)) {
        purgeActiveObject <- ConfigNodePropertyBoolean$new()
        purgeActiveObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$purgeActive, auto_unbox = TRUE))
        self$`purgeActive` <- purgeActiveObject
      }
      if (!is.null(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$`activeAge`)) {
        activeAgeObject <- ConfigNodePropertyInteger$new()
        activeAgeObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$activeAge, auto_unbox = TRUE))
        self$`activeAge` <- activeAgeObject
      }
      if (!is.null(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$`saveThreshold`)) {
        saveThresholdObject <- ConfigNodePropertyInteger$new()
        saveThresholdObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$saveThreshold, auto_unbox = TRUE))
        self$`saveThreshold` <- saveThresholdObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "purgeCompleted": %s,
           "completedAge": %s,
           "purgeActive": %s,
           "activeAge": %s,
           "saveThreshold": %s
        }',
        self$`purgeCompleted`$toJSON(),
        self$`completedAge`$toJSON(),
        self$`purgeActive`$toJSON(),
        self$`activeAge`$toJSON(),
        self$`saveThreshold`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesJson) {
      ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesJson)
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`purgeCompleted` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$purgeCompleted, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`completedAge` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$completedAge, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`purgeActive` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$purgeActive, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`activeAge` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$activeAge, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`saveThreshold` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesObject$saveThreshold, auto_unbox = TRUE))
    }
  )
)