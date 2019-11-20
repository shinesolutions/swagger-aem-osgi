# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo Class
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
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo <- R6::R6Class(
  'OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo',
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
      OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject <- list()
      if (!is.null(self$`pid`)) {
        OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject[['properties']] <- self$`properties`$toJSON()
      }
      if (!is.null(self$`bundle_location`)) {
        OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject[['bundle_location']] <- self$`bundle_location`
      }
      if (!is.null(self$`service_location`)) {
        OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject[['service_location']] <- self$`service_location`
      }

      OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject
    },
    fromJSON = function(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoJson) {
      OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject <- jsonlite::fromJSON(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoJson)
      if (!is.null(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`pid`)) {
        self$`pid` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`pid`
      }
      if (!is.null(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`title`)) {
        self$`title` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`title`
      }
      if (!is.null(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`description`)) {
        self$`description` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`description`
      }
      if (!is.null(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`properties`)) {
        propertiesObject <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$properties, auto_unbox = TRUE))
        self$`properties` <- propertiesObject
      }
      if (!is.null(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`bundle_location`)) {
        self$`bundle_location` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`bundle_location`
      }
      if (!is.null(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`service_location`)) {
        self$`service_location` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`service_location`
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
    fromJSONString = function(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoJson) {
      OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject <- jsonlite::fromJSON(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoJson)
      self$`pid` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`pid`
      self$`title` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`title`
      self$`description` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`description`
      OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesObject <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties$new()
      self$`properties` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesObject$fromJSON(jsonlite::toJSON(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$properties, auto_unbox = TRUE))
      self$`bundle_location` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`bundle_location`
      self$`service_location` <- OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoObject$`service_location`
    }
  )
)