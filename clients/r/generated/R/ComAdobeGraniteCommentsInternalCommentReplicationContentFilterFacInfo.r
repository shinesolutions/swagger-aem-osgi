# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo <- R6::R6Class(
  'ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo',
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
      ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject
    },
    fromJSON = function(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoJson) {
      ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject <- jsonlite::fromJSON(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoJson)
      if (!is.null(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`pid`)) {
        self$`pid` <- ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`pid`
      }
      if (!is.null(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`title`)) {
        self$`title` <- ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`title`
      }
      if (!is.null(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`description`)) {
        self$`description` <- ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`description`
      }
      if (!is.null(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`properties`)) {
        propertiesObject <- ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoJson) {
      ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject <- jsonlite::fromJSON(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoJson)
      self$`pid` <- ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`pid`
      self$`title` <- ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`title`
      self$`description` <- ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$`description`
      ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesObject <- ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties$new()
      self$`properties` <- ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoObject$properties, auto_unbox = TRUE))
    }
  )
)