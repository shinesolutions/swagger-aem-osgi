# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo <- R6::R6Class(
  'ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo',
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
      ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject
    },
    fromJSON = function(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoJson) {
      ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject <- jsonlite::fromJSON(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoJson)
      if (!is.null(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`pid`)) {
        self$`pid` <- ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`pid`
      }
      if (!is.null(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`title`)) {
        self$`title` <- ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`title`
      }
      if (!is.null(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`description`)) {
        self$`description` <- ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`description`
      }
      if (!is.null(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`properties`)) {
        propertiesObject <- ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoJson) {
      ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject <- jsonlite::fromJSON(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoJson)
      self$`pid` <- ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`pid`
      self$`title` <- ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`title`
      self$`description` <- ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$`description`
      ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesObject <- ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties$new()
      self$`properties` <- ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoObject$properties, auto_unbox = TRUE))
    }
  )
)