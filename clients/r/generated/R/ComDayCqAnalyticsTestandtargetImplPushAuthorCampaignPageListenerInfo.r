# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo Class
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
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo <- R6::R6Class(
  'ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo',
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
      ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject[['properties']] <- self$`properties`$toJSON()
      }
      if (!is.null(self$`bundle_location`)) {
        ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject[['bundle_location']] <- self$`bundle_location`
      }
      if (!is.null(self$`service_location`)) {
        ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject[['service_location']] <- self$`service_location`
      }

      ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject
    },
    fromJSON = function(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoJson) {
      ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject <- jsonlite::fromJSON(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoJson)
      if (!is.null(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`pid`)) {
        self$`pid` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`pid`
      }
      if (!is.null(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`title`)) {
        self$`title` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`title`
      }
      if (!is.null(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`description`)) {
        self$`description` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`description`
      }
      if (!is.null(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`properties`)) {
        propertiesObject <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$properties, auto_unbox = TRUE))
        self$`properties` <- propertiesObject
      }
      if (!is.null(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`bundle_location`)) {
        self$`bundle_location` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`bundle_location`
      }
      if (!is.null(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`service_location`)) {
        self$`service_location` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`service_location`
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
    fromJSONString = function(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoJson) {
      ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject <- jsonlite::fromJSON(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoJson)
      self$`pid` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`pid`
      self$`title` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`title`
      self$`description` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`description`
      ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesObject <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties$new()
      self$`properties` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$properties, auto_unbox = TRUE))
      self$`bundle_location` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`bundle_location`
      self$`service_location` <- ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoObject$`service_location`
    }
  )
)