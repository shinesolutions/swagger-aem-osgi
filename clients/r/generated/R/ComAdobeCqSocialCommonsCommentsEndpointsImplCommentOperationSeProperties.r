# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties Class
#'
#' @field fieldWhitelist 
#' @field attachmentTypeBlacklist 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties <- R6::R6Class(
  'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties',
  public = list(
    `fieldWhitelist` = NULL,
    `attachmentTypeBlacklist` = NULL,
    initialize = function(`fieldWhitelist`, `attachmentTypeBlacklist`){
      if (!missing(`fieldWhitelist`)) {
        stopifnot(R6::is.R6(`fieldWhitelist`))
        self$`fieldWhitelist` <- `fieldWhitelist`
      }
      if (!missing(`attachmentTypeBlacklist`)) {
        stopifnot(R6::is.R6(`attachmentTypeBlacklist`))
        self$`attachmentTypeBlacklist` <- `attachmentTypeBlacklist`
      }
    },
    toJSON = function() {
      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject <- list()
      if (!is.null(self$`fieldWhitelist`)) {
        ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject[['fieldWhitelist']] <- self$`fieldWhitelist`$toJSON()
      }
      if (!is.null(self$`attachmentTypeBlacklist`)) {
        ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject[['attachmentTypeBlacklist']] <- self$`attachmentTypeBlacklist`$toJSON()
      }

      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject
    },
    fromJSON = function(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesJson) {
      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesJson)
      if (!is.null(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject$`fieldWhitelist`)) {
        fieldWhitelistObject <- ConfigNodePropertyArray$new()
        fieldWhitelistObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject$fieldWhitelist, auto_unbox = TRUE))
        self$`fieldWhitelist` <- fieldWhitelistObject
      }
      if (!is.null(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject$`attachmentTypeBlacklist`)) {
        attachmentTypeBlacklistObject <- ConfigNodePropertyArray$new()
        attachmentTypeBlacklistObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject$attachmentTypeBlacklist, auto_unbox = TRUE))
        self$`attachmentTypeBlacklist` <- attachmentTypeBlacklistObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "fieldWhitelist": %s,
           "attachmentTypeBlacklist": %s
        }',
        self$`fieldWhitelist`$toJSON(),
        self$`attachmentTypeBlacklist`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesJson) {
      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`fieldWhitelist` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject$fieldWhitelist, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`attachmentTypeBlacklist` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesObject$attachmentTypeBlacklist, auto_unbox = TRUE))
    }
  )
)