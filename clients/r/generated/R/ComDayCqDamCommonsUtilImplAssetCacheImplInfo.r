# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqDamCommonsUtilImplAssetCacheImplInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqDamCommonsUtilImplAssetCacheImplInfo <- R6::R6Class(
  'ComDayCqDamCommonsUtilImplAssetCacheImplInfo',
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
      ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject
    },
    fromJSON = function(ComDayCqDamCommonsUtilImplAssetCacheImplInfoJson) {
      ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject <- jsonlite::fromJSON(ComDayCqDamCommonsUtilImplAssetCacheImplInfoJson)
      if (!is.null(ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`pid`)) {
        self$`pid` <- ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`pid`
      }
      if (!is.null(ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`title`)) {
        self$`title` <- ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`title`
      }
      if (!is.null(ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`description`)) {
        self$`description` <- ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`description`
      }
      if (!is.null(ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`properties`)) {
        propertiesObject <- ComDayCqDamCommonsUtilImplAssetCacheImplProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComDayCqDamCommonsUtilImplAssetCacheImplInfoJson) {
      ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject <- jsonlite::fromJSON(ComDayCqDamCommonsUtilImplAssetCacheImplInfoJson)
      self$`pid` <- ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`pid`
      self$`title` <- ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`title`
      self$`description` <- ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$`description`
      ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesObject <- ComDayCqDamCommonsUtilImplAssetCacheImplProperties$new()
      self$`properties` <- ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqDamCommonsUtilImplAssetCacheImplInfoObject$properties, auto_unbox = TRUE))
    }
  )
)