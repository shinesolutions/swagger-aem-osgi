# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqProjectsPurgeSchedulerInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqProjectsPurgeSchedulerInfo <- R6::R6Class(
  'ComAdobeCqProjectsPurgeSchedulerInfo',
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
      ComAdobeCqProjectsPurgeSchedulerInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeCqProjectsPurgeSchedulerInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeCqProjectsPurgeSchedulerInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeCqProjectsPurgeSchedulerInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeCqProjectsPurgeSchedulerInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeCqProjectsPurgeSchedulerInfoObject
    },
    fromJSON = function(ComAdobeCqProjectsPurgeSchedulerInfoJson) {
      ComAdobeCqProjectsPurgeSchedulerInfoObject <- jsonlite::fromJSON(ComAdobeCqProjectsPurgeSchedulerInfoJson)
      if (!is.null(ComAdobeCqProjectsPurgeSchedulerInfoObject$`pid`)) {
        self$`pid` <- ComAdobeCqProjectsPurgeSchedulerInfoObject$`pid`
      }
      if (!is.null(ComAdobeCqProjectsPurgeSchedulerInfoObject$`title`)) {
        self$`title` <- ComAdobeCqProjectsPurgeSchedulerInfoObject$`title`
      }
      if (!is.null(ComAdobeCqProjectsPurgeSchedulerInfoObject$`description`)) {
        self$`description` <- ComAdobeCqProjectsPurgeSchedulerInfoObject$`description`
      }
      if (!is.null(ComAdobeCqProjectsPurgeSchedulerInfoObject$`properties`)) {
        propertiesObject <- ComAdobeCqProjectsPurgeSchedulerProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqProjectsPurgeSchedulerInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeCqProjectsPurgeSchedulerInfoJson) {
      ComAdobeCqProjectsPurgeSchedulerInfoObject <- jsonlite::fromJSON(ComAdobeCqProjectsPurgeSchedulerInfoJson)
      self$`pid` <- ComAdobeCqProjectsPurgeSchedulerInfoObject$`pid`
      self$`title` <- ComAdobeCqProjectsPurgeSchedulerInfoObject$`title`
      self$`description` <- ComAdobeCqProjectsPurgeSchedulerInfoObject$`description`
      ComAdobeCqProjectsPurgeSchedulerPropertiesObject <- ComAdobeCqProjectsPurgeSchedulerProperties$new()
      self$`properties` <- ComAdobeCqProjectsPurgeSchedulerPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqProjectsPurgeSchedulerInfoObject$properties, auto_unbox = TRUE))
    }
  )
)
