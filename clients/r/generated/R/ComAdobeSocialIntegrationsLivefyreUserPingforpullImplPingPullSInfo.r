# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo <- R6::R6Class(
  'ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo',
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
      ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject
    },
    fromJSON = function(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoJson) {
      ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject <- jsonlite::fromJSON(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoJson)
      if (!is.null(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`pid`)) {
        self$`pid` <- ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`pid`
      }
      if (!is.null(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`title`)) {
        self$`title` <- ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`title`
      }
      if (!is.null(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`description`)) {
        self$`description` <- ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`description`
      }
      if (!is.null(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`properties`)) {
        propertiesObject <- ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoJson) {
      ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject <- jsonlite::fromJSON(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoJson)
      self$`pid` <- ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`pid`
      self$`title` <- ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`title`
      self$`description` <- ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$`description`
      ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesObject <- ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties$new()
      self$`properties` <- ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoObject$properties, auto_unbox = TRUE))
    }
  )
)