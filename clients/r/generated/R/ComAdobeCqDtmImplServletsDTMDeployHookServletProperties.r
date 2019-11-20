# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqDtmImplServletsDTMDeployHookServletProperties Class
#'
#' @field dtm.staging.ip.whitelist 
#' @field dtm.production.ip.whitelist 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties <- R6::R6Class(
  'ComAdobeCqDtmImplServletsDTMDeployHookServletProperties',
  public = list(
    `dtm.staging.ip.whitelist` = NULL,
    `dtm.production.ip.whitelist` = NULL,
    initialize = function(`dtm.staging.ip.whitelist`, `dtm.production.ip.whitelist`){
      if (!missing(`dtm.staging.ip.whitelist`)) {
        stopifnot(R6::is.R6(`dtm.staging.ip.whitelist`))
        self$`dtm.staging.ip.whitelist` <- `dtm.staging.ip.whitelist`
      }
      if (!missing(`dtm.production.ip.whitelist`)) {
        stopifnot(R6::is.R6(`dtm.production.ip.whitelist`))
        self$`dtm.production.ip.whitelist` <- `dtm.production.ip.whitelist`
      }
    },
    toJSON = function() {
      ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject <- list()
      if (!is.null(self$`dtm.staging.ip.whitelist`)) {
        ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject[['dtm.staging.ip.whitelist']] <- self$`dtm.staging.ip.whitelist`$toJSON()
      }
      if (!is.null(self$`dtm.production.ip.whitelist`)) {
        ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject[['dtm.production.ip.whitelist']] <- self$`dtm.production.ip.whitelist`$toJSON()
      }

      ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject
    },
    fromJSON = function(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesJson) {
      ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject <- jsonlite::fromJSON(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesJson)
      if (!is.null(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject$`dtm.staging.ip.whitelist`)) {
        dtm.staging.ip.whitelistObject <- ConfigNodePropertyArray$new()
        dtm.staging.ip.whitelistObject$fromJSON(jsonlite::toJSON(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject$dtm.staging.ip.whitelist, auto_unbox = TRUE))
        self$`dtm.staging.ip.whitelist` <- dtm.staging.ip.whitelistObject
      }
      if (!is.null(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject$`dtm.production.ip.whitelist`)) {
        dtm.production.ip.whitelistObject <- ConfigNodePropertyArray$new()
        dtm.production.ip.whitelistObject$fromJSON(jsonlite::toJSON(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject$dtm.production.ip.whitelist, auto_unbox = TRUE))
        self$`dtm.production.ip.whitelist` <- dtm.production.ip.whitelistObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "dtm.staging.ip.whitelist": %s,
           "dtm.production.ip.whitelist": %s
        }',
        self$`dtm.staging.ip.whitelist`$toJSON(),
        self$`dtm.production.ip.whitelist`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesJson) {
      ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject <- jsonlite::fromJSON(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`dtm.staging.ip.whitelist` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject$dtm.staging.ip.whitelist, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`dtm.production.ip.whitelist` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesObject$dtm.production.ip.whitelist, auto_unbox = TRUE))
    }
  )
)