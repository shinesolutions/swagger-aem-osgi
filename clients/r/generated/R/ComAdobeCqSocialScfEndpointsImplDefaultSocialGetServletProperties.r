# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties Class
#'
#' @field sling.servlet.selectors 
#' @field sling.servlet.extensions 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties <- R6::R6Class(
  'ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties',
  public = list(
    `sling.servlet.selectors` = NULL,
    `sling.servlet.extensions` = NULL,
    initialize = function(`sling.servlet.selectors`, `sling.servlet.extensions`){
      if (!missing(`sling.servlet.selectors`)) {
        stopifnot(R6::is.R6(`sling.servlet.selectors`))
        self$`sling.servlet.selectors` <- `sling.servlet.selectors`
      }
      if (!missing(`sling.servlet.extensions`)) {
        stopifnot(R6::is.R6(`sling.servlet.extensions`))
        self$`sling.servlet.extensions` <- `sling.servlet.extensions`
      }
    },
    toJSON = function() {
      ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject <- list()
      if (!is.null(self$`sling.servlet.selectors`)) {
        ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject[['sling.servlet.selectors']] <- self$`sling.servlet.selectors`$toJSON()
      }
      if (!is.null(self$`sling.servlet.extensions`)) {
        ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject[['sling.servlet.extensions']] <- self$`sling.servlet.extensions`$toJSON()
      }

      ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject
    },
    fromJSON = function(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesJson) {
      ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesJson)
      if (!is.null(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject$`sling.servlet.selectors`)) {
        sling.servlet.selectorsObject <- ConfigNodePropertyArray$new()
        sling.servlet.selectorsObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject$sling.servlet.selectors, auto_unbox = TRUE))
        self$`sling.servlet.selectors` <- sling.servlet.selectorsObject
      }
      if (!is.null(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject$`sling.servlet.extensions`)) {
        sling.servlet.extensionsObject <- ConfigNodePropertyString$new()
        sling.servlet.extensionsObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject$sling.servlet.extensions, auto_unbox = TRUE))
        self$`sling.servlet.extensions` <- sling.servlet.extensionsObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "sling.servlet.selectors": %s,
           "sling.servlet.extensions": %s
        }',
        self$`sling.servlet.selectors`$toJSON(),
        self$`sling.servlet.extensions`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesJson) {
      ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`sling.servlet.selectors` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject$sling.servlet.selectors, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`sling.servlet.extensions` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesObject$sling.servlet.extensions, auto_unbox = TRUE))
    }
  )
)