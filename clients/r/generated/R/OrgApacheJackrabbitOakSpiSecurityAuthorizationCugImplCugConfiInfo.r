# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo Class
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
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo <- R6::R6Class(
  'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo',
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
      OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject <- list()
      if (!is.null(self$`pid`)) {
        OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject[['properties']] <- self$`properties`$toJSON()
      }
      if (!is.null(self$`bundle_location`)) {
        OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject[['bundle_location']] <- self$`bundle_location`
      }
      if (!is.null(self$`service_location`)) {
        OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject[['service_location']] <- self$`service_location`
      }

      OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject
    },
    fromJSON = function(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoJson) {
      OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject <- jsonlite::fromJSON(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoJson)
      if (!is.null(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`pid`)) {
        self$`pid` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`pid`
      }
      if (!is.null(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`title`)) {
        self$`title` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`title`
      }
      if (!is.null(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`description`)) {
        self$`description` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`description`
      }
      if (!is.null(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`properties`)) {
        propertiesObject <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$properties, auto_unbox = TRUE))
        self$`properties` <- propertiesObject
      }
      if (!is.null(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`bundle_location`)) {
        self$`bundle_location` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`bundle_location`
      }
      if (!is.null(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`service_location`)) {
        self$`service_location` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`service_location`
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
    fromJSONString = function(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoJson) {
      OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject <- jsonlite::fromJSON(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoJson)
      self$`pid` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`pid`
      self$`title` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`title`
      self$`description` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`description`
      OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesObject <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties$new()
      self$`properties` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$properties, auto_unbox = TRUE))
      self$`bundle_location` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`bundle_location`
      self$`service_location` <- OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoObject$`service_location`
    }
  )
)