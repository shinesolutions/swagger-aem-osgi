# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo <- R6::R6Class(
  'ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo',
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
      ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject
    },
    fromJSON = function(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoJson) {
      ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject <- jsonlite::fromJSON(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoJson)
      if (!is.null(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`pid`)) {
        self$`pid` <- ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`pid`
      }
      if (!is.null(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`title`)) {
        self$`title` <- ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`title`
      }
      if (!is.null(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`description`)) {
        self$`description` <- ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`description`
      }
      if (!is.null(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`properties`)) {
        propertiesObject <- ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoJson) {
      ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject <- jsonlite::fromJSON(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoJson)
      self$`pid` <- ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`pid`
      self$`title` <- ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`title`
      self$`description` <- ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$`description`
      ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesObject <- ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties$new()
      self$`properties` <- ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoObject$properties, auto_unbox = TRUE))
    }
  )
)