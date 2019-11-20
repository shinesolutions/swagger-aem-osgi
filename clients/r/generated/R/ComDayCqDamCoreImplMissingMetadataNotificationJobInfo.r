# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqDamCoreImplMissingMetadataNotificationJobInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo <- R6::R6Class(
  'ComDayCqDamCoreImplMissingMetadataNotificationJobInfo',
  public = list(
    `pid` = NULL,
    `title` = NULL,
    `description` = NULL,
    `properties` = NULL,
    initialize = function(`pid`, `title`, `description`, `properties`){
      if (!missing(`pid`)) {
        stopifnot(is.character(`pid`), length(`pid`) == 1)
        self$`pid` <- `pid`
      }
      if (!missing(`title`)) {
        stopifnot(is.character(`title`), length(`title`) == 1)
        self$`title` <- `title`
      }
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`properties`)) {
        stopifnot(R6::is.R6(`properties`))
        self$`properties` <- `properties`
      }
    },
    toJSON = function() {
      ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject
    },
    fromJSON = function(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoJson) {
      ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject <- jsonlite::fromJSON(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoJson)
      if (!is.null(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`pid`)) {
        self$`pid` <- ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`pid`
      }
      if (!is.null(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`title`)) {
        self$`title` <- ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`title`
      }
      if (!is.null(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`description`)) {
        self$`description` <- ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`description`
      }
      if (!is.null(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`properties`)) {
        propertiesObject <- ComDayCqDamCoreImplMissingMetadataNotificationJobProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$properties, auto_unbox = TRUE))
        self$`properties` <- propertiesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "pid": %s,
           "title": %s,
           "description": %s,
           "properties": %s
        }',
        self$`pid`,
        self$`title`,
        self$`description`,
        self$`properties`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoJson) {
      ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject <- jsonlite::fromJSON(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoJson)
      self$`pid` <- ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`pid`
      self$`title` <- ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`title`
      self$`description` <- ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$`description`
      ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesObject <- ComDayCqDamCoreImplMissingMetadataNotificationJobProperties$new()
      self$`properties` <- ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplMissingMetadataNotificationJobInfoObject$properties, auto_unbox = TRUE))
    }
  )
)