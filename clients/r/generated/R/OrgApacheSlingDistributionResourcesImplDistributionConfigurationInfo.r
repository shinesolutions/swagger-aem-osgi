# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo <- R6::R6Class(
  'OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo',
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
      OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject <- list()
      if (!is.null(self$`pid`)) {
        OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject
    },
    fromJSON = function(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoJson) {
      OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject <- jsonlite::fromJSON(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoJson)
      if (!is.null(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`pid`)) {
        self$`pid` <- OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`pid`
      }
      if (!is.null(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`title`)) {
        self$`title` <- OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`title`
      }
      if (!is.null(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`description`)) {
        self$`description` <- OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`description`
      }
      if (!is.null(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`properties`)) {
        propertiesObject <- OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoJson) {
      OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject <- jsonlite::fromJSON(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoJson)
      self$`pid` <- OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`pid`
      self$`title` <- OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`title`
      self$`description` <- OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$`description`
      OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesObject <- OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties$new()
      self$`properties` <- OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesObject$fromJSON(jsonlite::toJSON(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoObject$properties, auto_unbox = TRUE))
    }
  )
)