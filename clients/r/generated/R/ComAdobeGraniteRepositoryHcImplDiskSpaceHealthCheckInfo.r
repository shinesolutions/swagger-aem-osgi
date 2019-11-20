# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo <- R6::R6Class(
  'ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo',
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
      ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject
    },
    fromJSON = function(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoJson) {
      ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject <- jsonlite::fromJSON(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoJson)
      if (!is.null(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`pid`)) {
        self$`pid` <- ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`pid`
      }
      if (!is.null(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`title`)) {
        self$`title` <- ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`title`
      }
      if (!is.null(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`description`)) {
        self$`description` <- ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`description`
      }
      if (!is.null(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`properties`)) {
        propertiesObject <- ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoJson) {
      ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject <- jsonlite::fromJSON(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoJson)
      self$`pid` <- ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`pid`
      self$`title` <- ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`title`
      self$`description` <- ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$`description`
      ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesObject <- ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties$new()
      self$`properties` <- ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoObject$properties, auto_unbox = TRUE))
    }
  )
)