# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo <- R6::R6Class(
  'ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo',
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
      ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject
    },
    fromJSON = function(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoJson) {
      ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject <- jsonlite::fromJSON(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoJson)
      if (!is.null(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`pid`)) {
        self$`pid` <- ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`pid`
      }
      if (!is.null(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`title`)) {
        self$`title` <- ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`title`
      }
      if (!is.null(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`description`)) {
        self$`description` <- ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`description`
      }
      if (!is.null(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`properties`)) {
        propertiesObject <- ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoJson) {
      ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject <- jsonlite::fromJSON(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoJson)
      self$`pid` <- ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`pid`
      self$`title` <- ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`title`
      self$`description` <- ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$`description`
      ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesObject <- ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties$new()
      self$`properties` <- ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoObject$properties, auto_unbox = TRUE))
    }
  )
)