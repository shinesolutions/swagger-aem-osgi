# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqSearchImplBuilderQueryBuilderImplProperties Class
#'
#' @field excerpt.properties 
#' @field cache.max.entries 
#' @field cache.entry.lifetime 
#' @field xpath.union 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqSearchImplBuilderQueryBuilderImplProperties <- R6::R6Class(
  'ComDayCqSearchImplBuilderQueryBuilderImplProperties',
  public = list(
    `excerpt.properties` = NULL,
    `cache.max.entries` = NULL,
    `cache.entry.lifetime` = NULL,
    `xpath.union` = NULL,
    initialize = function(`excerpt.properties`, `cache.max.entries`, `cache.entry.lifetime`, `xpath.union`){
      if (!missing(`excerpt.properties`)) {
        stopifnot(R6::is.R6(`excerpt.properties`))
        self$`excerpt.properties` <- `excerpt.properties`
      }
      if (!missing(`cache.max.entries`)) {
        stopifnot(R6::is.R6(`cache.max.entries`))
        self$`cache.max.entries` <- `cache.max.entries`
      }
      if (!missing(`cache.entry.lifetime`)) {
        stopifnot(R6::is.R6(`cache.entry.lifetime`))
        self$`cache.entry.lifetime` <- `cache.entry.lifetime`
      }
      if (!missing(`xpath.union`)) {
        stopifnot(R6::is.R6(`xpath.union`))
        self$`xpath.union` <- `xpath.union`
      }
    },
    toJSON = function() {
      ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject <- list()
      if (!is.null(self$`excerpt.properties`)) {
        ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject[['excerpt.properties']] <- self$`excerpt.properties`$toJSON()
      }
      if (!is.null(self$`cache.max.entries`)) {
        ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject[['cache.max.entries']] <- self$`cache.max.entries`$toJSON()
      }
      if (!is.null(self$`cache.entry.lifetime`)) {
        ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject[['cache.entry.lifetime']] <- self$`cache.entry.lifetime`$toJSON()
      }
      if (!is.null(self$`xpath.union`)) {
        ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject[['xpath.union']] <- self$`xpath.union`$toJSON()
      }

      ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject
    },
    fromJSON = function(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesJson) {
      ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject <- jsonlite::fromJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesJson)
      if (!is.null(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$`excerpt.properties`)) {
        excerpt.propertiesObject <- ConfigNodePropertyArray$new()
        excerpt.propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$excerpt.properties, auto_unbox = TRUE))
        self$`excerpt.properties` <- excerpt.propertiesObject
      }
      if (!is.null(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$`cache.max.entries`)) {
        cache.max.entriesObject <- ConfigNodePropertyInteger$new()
        cache.max.entriesObject$fromJSON(jsonlite::toJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$cache.max.entries, auto_unbox = TRUE))
        self$`cache.max.entries` <- cache.max.entriesObject
      }
      if (!is.null(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$`cache.entry.lifetime`)) {
        cache.entry.lifetimeObject <- ConfigNodePropertyInteger$new()
        cache.entry.lifetimeObject$fromJSON(jsonlite::toJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$cache.entry.lifetime, auto_unbox = TRUE))
        self$`cache.entry.lifetime` <- cache.entry.lifetimeObject
      }
      if (!is.null(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$`xpath.union`)) {
        xpath.unionObject <- ConfigNodePropertyBoolean$new()
        xpath.unionObject$fromJSON(jsonlite::toJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$xpath.union, auto_unbox = TRUE))
        self$`xpath.union` <- xpath.unionObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "excerpt.properties": %s,
           "cache.max.entries": %s,
           "cache.entry.lifetime": %s,
           "xpath.union": %s
        }',
        self$`excerpt.properties`$toJSON(),
        self$`cache.max.entries`$toJSON(),
        self$`cache.entry.lifetime`$toJSON(),
        self$`xpath.union`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesJson) {
      ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject <- jsonlite::fromJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`excerpt.properties` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$excerpt.properties, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`cache.max.entries` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$cache.max.entries, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`cache.entry.lifetime` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$cache.entry.lifetime, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`xpath.union` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesObject$xpath.union, auto_unbox = TRUE))
    }
  )
)