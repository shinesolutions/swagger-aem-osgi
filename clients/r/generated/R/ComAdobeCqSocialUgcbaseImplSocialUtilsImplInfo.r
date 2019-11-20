# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo <- R6::R6Class(
  'ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo',
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
      ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject
    },
    fromJSON = function(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoJson) {
      ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject <- jsonlite::fromJSON(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoJson)
      if (!is.null(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`pid`)) {
        self$`pid` <- ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`pid`
      }
      if (!is.null(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`title`)) {
        self$`title` <- ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`title`
      }
      if (!is.null(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`description`)) {
        self$`description` <- ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`description`
      }
      if (!is.null(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`properties`)) {
        propertiesObject <- ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoJson) {
      ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject <- jsonlite::fromJSON(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoJson)
      self$`pid` <- ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`pid`
      self$`title` <- ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`title`
      self$`description` <- ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$`description`
      ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesObject <- ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties$new()
      self$`properties` <- ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoObject$properties, auto_unbox = TRUE))
    }
  )
)