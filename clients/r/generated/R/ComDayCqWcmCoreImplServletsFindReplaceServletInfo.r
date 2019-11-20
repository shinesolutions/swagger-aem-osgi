# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqWcmCoreImplServletsFindReplaceServletInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqWcmCoreImplServletsFindReplaceServletInfo <- R6::R6Class(
  'ComDayCqWcmCoreImplServletsFindReplaceServletInfo',
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
      ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject
    },
    fromJSON = function(ComDayCqWcmCoreImplServletsFindReplaceServletInfoJson) {
      ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject <- jsonlite::fromJSON(ComDayCqWcmCoreImplServletsFindReplaceServletInfoJson)
      if (!is.null(ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`pid`)) {
        self$`pid` <- ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`pid`
      }
      if (!is.null(ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`title`)) {
        self$`title` <- ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`title`
      }
      if (!is.null(ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`description`)) {
        self$`description` <- ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`description`
      }
      if (!is.null(ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`properties`)) {
        propertiesObject <- ComDayCqWcmCoreImplServletsFindReplaceServletProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComDayCqWcmCoreImplServletsFindReplaceServletInfoJson) {
      ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject <- jsonlite::fromJSON(ComDayCqWcmCoreImplServletsFindReplaceServletInfoJson)
      self$`pid` <- ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`pid`
      self$`title` <- ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`title`
      self$`description` <- ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$`description`
      ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesObject <- ComDayCqWcmCoreImplServletsFindReplaceServletProperties$new()
      self$`properties` <- ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqWcmCoreImplServletsFindReplaceServletInfoObject$properties, auto_unbox = TRUE))
    }
  )
)