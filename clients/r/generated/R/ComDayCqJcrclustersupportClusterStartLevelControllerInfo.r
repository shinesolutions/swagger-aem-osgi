# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqJcrclustersupportClusterStartLevelControllerInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqJcrclustersupportClusterStartLevelControllerInfo <- R6::R6Class(
  'ComDayCqJcrclustersupportClusterStartLevelControllerInfo',
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
      ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject
    },
    fromJSON = function(ComDayCqJcrclustersupportClusterStartLevelControllerInfoJson) {
      ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject <- jsonlite::fromJSON(ComDayCqJcrclustersupportClusterStartLevelControllerInfoJson)
      if (!is.null(ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`pid`)) {
        self$`pid` <- ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`pid`
      }
      if (!is.null(ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`title`)) {
        self$`title` <- ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`title`
      }
      if (!is.null(ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`description`)) {
        self$`description` <- ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`description`
      }
      if (!is.null(ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`properties`)) {
        propertiesObject <- ComDayCqJcrclustersupportClusterStartLevelControllerProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComDayCqJcrclustersupportClusterStartLevelControllerInfoJson) {
      ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject <- jsonlite::fromJSON(ComDayCqJcrclustersupportClusterStartLevelControllerInfoJson)
      self$`pid` <- ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`pid`
      self$`title` <- ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`title`
      self$`description` <- ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$`description`
      ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesObject <- ComDayCqJcrclustersupportClusterStartLevelControllerProperties$new()
      self$`properties` <- ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqJcrclustersupportClusterStartLevelControllerInfoObject$properties, auto_unbox = TRUE))
    }
  )
)