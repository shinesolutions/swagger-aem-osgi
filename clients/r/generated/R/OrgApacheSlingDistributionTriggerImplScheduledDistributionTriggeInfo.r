# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo <- R6::R6Class(
  'OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo',
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
      OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject <- list()
      if (!is.null(self$`pid`)) {
        OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject
    },
    fromJSON = function(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoJson) {
      OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject <- jsonlite::fromJSON(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoJson)
      if (!is.null(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`pid`)) {
        self$`pid` <- OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`pid`
      }
      if (!is.null(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`title`)) {
        self$`title` <- OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`title`
      }
      if (!is.null(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`description`)) {
        self$`description` <- OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`description`
      }
      if (!is.null(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`properties`)) {
        propertiesObject <- OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoJson) {
      OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject <- jsonlite::fromJSON(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoJson)
      self$`pid` <- OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`pid`
      self$`title` <- OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`title`
      self$`description` <- OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$`description`
      OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesObject <- OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties$new()
      self$`properties` <- OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesObject$fromJSON(jsonlite::toJSON(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoObject$properties, auto_unbox = TRUE))
    }
  )
)