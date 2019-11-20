# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties Class
#'
#' @field fieldWhitelist 
#' @field attachmentTypeBlacklist 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties <- R6::R6Class(
  'ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties',
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
      ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject <- list()
      if (!is.null(self$`fieldWhitelist`)) {
        ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject[['fieldWhitelist']] <- self$`fieldWhitelist`$toJSON()
      }
      if (!is.null(self$`attachmentTypeBlacklist`)) {
        ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject[['attachmentTypeBlacklist']] <- self$`attachmentTypeBlacklist`$toJSON()
      }

      ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject
    },
    fromJSON = function(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesJson) {
      ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesJson)
      if (!is.null(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject$`fieldWhitelist`)) {
        fieldWhitelistObject <- ConfigNodePropertyArray$new()
        fieldWhitelistObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject$fieldWhitelist, auto_unbox = TRUE))
        self$`fieldWhitelist` <- fieldWhitelistObject
      }
      if (!is.null(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject$`attachmentTypeBlacklist`)) {
        attachmentTypeBlacklistObject <- ConfigNodePropertyArray$new()
        attachmentTypeBlacklistObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject$attachmentTypeBlacklist, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesJson) {
      ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`fieldWhitelist` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject$fieldWhitelist, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`attachmentTypeBlacklist` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesObject$attachmentTypeBlacklist, auto_unbox = TRUE))
    }
  )
)