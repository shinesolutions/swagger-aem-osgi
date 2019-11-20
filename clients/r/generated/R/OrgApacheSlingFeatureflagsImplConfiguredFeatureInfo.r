# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo <- R6::R6Class(
  'OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo',
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
      OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject <- list()
      if (!is.null(self$`pid`)) {
        OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject
    },
    fromJSON = function(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoJson) {
      OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject <- jsonlite::fromJSON(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoJson)
      if (!is.null(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`pid`)) {
        self$`pid` <- OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`pid`
      }
      if (!is.null(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`title`)) {
        self$`title` <- OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`title`
      }
      if (!is.null(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`description`)) {
        self$`description` <- OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`description`
      }
      if (!is.null(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`properties`)) {
        propertiesObject <- OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoJson) {
      OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject <- jsonlite::fromJSON(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoJson)
      self$`pid` <- OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`pid`
      self$`title` <- OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`title`
      self$`description` <- OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$`description`
      OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesObject <- OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties$new()
      self$`properties` <- OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesObject$fromJSON(jsonlite::toJSON(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoObject$properties, auto_unbox = TRUE))
    }
  )
)