# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo <- R6::R6Class(
  'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo',
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
      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject
    },
    fromJSON = function(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoJson) {
      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject <- jsonlite::fromJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoJson)
      if (!is.null(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`pid`)) {
        self$`pid` <- ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`pid`
      }
      if (!is.null(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`title`)) {
        self$`title` <- ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`title`
      }
      if (!is.null(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`description`)) {
        self$`description` <- ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`description`
      }
      if (!is.null(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`properties`)) {
        propertiesObject <- ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoJson) {
      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject <- jsonlite::fromJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoJson)
      self$`pid` <- ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`pid`
      self$`title` <- ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`title`
      self$`description` <- ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$`description`
      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject <- ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties$new()
      self$`properties` <- ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoObject$properties, auto_unbox = TRUE))
    }
  )
)