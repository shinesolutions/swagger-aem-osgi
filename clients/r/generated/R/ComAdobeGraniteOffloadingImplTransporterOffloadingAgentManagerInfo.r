# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#' @field bundle_location 
#' @field service_location 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo <- R6::R6Class(
  'ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo',
  public = list(
    `pid` = NULL,
    `title` = NULL,
    `description` = NULL,
    `properties` = NULL,
    `bundle_location` = NULL,
    `service_location` = NULL,
    initialize = function(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`){
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
      if (!missing(`bundle_location`)) {
        stopifnot(is.character(`bundle_location`), length(`bundle_location`) == 1)
        self$`bundle_location` <- `bundle_location`
      }
      if (!missing(`service_location`)) {
        stopifnot(is.character(`service_location`), length(`service_location`) == 1)
        self$`service_location` <- `service_location`
      }
    },
    toJSON = function() {
      ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject[['properties']] <- self$`properties`$toJSON()
      }
      if (!is.null(self$`bundle_location`)) {
        ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject[['bundle_location']] <- self$`bundle_location`
      }
      if (!is.null(self$`service_location`)) {
        ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject[['service_location']] <- self$`service_location`
      }

      ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject
    },
    fromJSON = function(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoJson) {
      ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject <- jsonlite::fromJSON(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoJson)
      if (!is.null(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`pid`)) {
        self$`pid` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`pid`
      }
      if (!is.null(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`title`)) {
        self$`title` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`title`
      }
      if (!is.null(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`description`)) {
        self$`description` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`description`
      }
      if (!is.null(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`properties`)) {
        propertiesObject <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$properties, auto_unbox = TRUE))
        self$`properties` <- propertiesObject
      }
      if (!is.null(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`bundle_location`)) {
        self$`bundle_location` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`bundle_location`
      }
      if (!is.null(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`service_location`)) {
        self$`service_location` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`service_location`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "pid": %s,
           "title": %s,
           "description": %s,
           "properties": %s,
           "bundle_location": %s,
           "service_location": %s
        }',
        self$`pid`,
        self$`title`,
        self$`description`,
        self$`properties`$toJSON(),
        self$`bundle_location`,
        self$`service_location`
      )
    },
    fromJSONString = function(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoJson) {
      ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject <- jsonlite::fromJSON(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoJson)
      self$`pid` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`pid`
      self$`title` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`title`
      self$`description` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`description`
      ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesObject <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties$new()
      self$`properties` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$properties, auto_unbox = TRUE))
      self$`bundle_location` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`bundle_location`
      self$`service_location` <- ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoObject$`service_location`
    }
  )
)