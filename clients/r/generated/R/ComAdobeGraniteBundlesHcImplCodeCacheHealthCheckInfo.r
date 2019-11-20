# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo <- R6::R6Class(
  'ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo',
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
      ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject
    },
    fromJSON = function(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoJson) {
      ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject <- jsonlite::fromJSON(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoJson)
      if (!is.null(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`pid`)) {
        self$`pid` <- ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`pid`
      }
      if (!is.null(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`title`)) {
        self$`title` <- ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`title`
      }
      if (!is.null(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`description`)) {
        self$`description` <- ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`description`
      }
      if (!is.null(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`properties`)) {
        propertiesObject <- ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoJson) {
      ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject <- jsonlite::fromJSON(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoJson)
      self$`pid` <- ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`pid`
      self$`title` <- ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`title`
      self$`description` <- ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$`description`
      ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesObject <- ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties$new()
      self$`properties` <- ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoObject$properties, auto_unbox = TRUE))
    }
  )
)