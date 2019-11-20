# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo <- R6::R6Class(
  'ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo',
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
      ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject
    },
    fromJSON = function(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoJson) {
      ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject <- jsonlite::fromJSON(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoJson)
      if (!is.null(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`pid`)) {
        self$`pid` <- ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`pid`
      }
      if (!is.null(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`title`)) {
        self$`title` <- ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`title`
      }
      if (!is.null(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`description`)) {
        self$`description` <- ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`description`
      }
      if (!is.null(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`properties`)) {
        propertiesObject <- ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoJson) {
      ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject <- jsonlite::fromJSON(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoJson)
      self$`pid` <- ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`pid`
      self$`title` <- ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`title`
      self$`description` <- ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$`description`
      ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesObject <- ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties$new()
      self$`properties` <- ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoObject$properties, auto_unbox = TRUE))
    }
  )
)