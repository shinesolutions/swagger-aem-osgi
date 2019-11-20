# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqWcmFoundationImplHTTPAuthHandlerInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo <- R6::R6Class(
  'ComDayCqWcmFoundationImplHTTPAuthHandlerInfo',
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
      ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject
    },
    fromJSON = function(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoJson) {
      ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject <- jsonlite::fromJSON(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoJson)
      if (!is.null(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`pid`)) {
        self$`pid` <- ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`pid`
      }
      if (!is.null(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`title`)) {
        self$`title` <- ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`title`
      }
      if (!is.null(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`description`)) {
        self$`description` <- ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`description`
      }
      if (!is.null(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`properties`)) {
        propertiesObject <- ComDayCqWcmFoundationImplHTTPAuthHandlerProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoJson) {
      ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject <- jsonlite::fromJSON(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoJson)
      self$`pid` <- ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`pid`
      self$`title` <- ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`title`
      self$`description` <- ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$`description`
      ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesObject <- ComDayCqWcmFoundationImplHTTPAuthHandlerProperties$new()
      self$`properties` <- ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqWcmFoundationImplHTTPAuthHandlerInfoObject$properties, auto_unbox = TRUE))
    }
  )
)