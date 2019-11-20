# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo <- R6::R6Class(
  'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo',
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
      ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject
    },
    fromJSON = function(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoJson) {
      ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject <- jsonlite::fromJSON(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoJson)
      if (!is.null(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`pid`)) {
        self$`pid` <- ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`pid`
      }
      if (!is.null(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`title`)) {
        self$`title` <- ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`title`
      }
      if (!is.null(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`description`)) {
        self$`description` <- ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`description`
      }
      if (!is.null(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`properties`)) {
        propertiesObject <- ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoJson) {
      ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject <- jsonlite::fromJSON(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoJson)
      self$`pid` <- ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`pid`
      self$`title` <- ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`title`
      self$`description` <- ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$`description`
      ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesObject <- ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties$new()
      self$`properties` <- ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoObject$properties, auto_unbox = TRUE))
    }
  )
)