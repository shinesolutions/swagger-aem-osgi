# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteWorkflowCorePayloadMapCacheProperties Class
#'
#' @field getSystemWorkflowModels 
#' @field getPackageRootPath 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties <- R6::R6Class(
  'ComAdobeGraniteWorkflowCorePayloadMapCacheProperties',
  public = list(
    `getSystemWorkflowModels` = NULL,
    `getPackageRootPath` = NULL,
    initialize = function(`getSystemWorkflowModels`, `getPackageRootPath`){
      if (!missing(`getSystemWorkflowModels`)) {
        stopifnot(R6::is.R6(`getSystemWorkflowModels`))
        self$`getSystemWorkflowModels` <- `getSystemWorkflowModels`
      }
      if (!missing(`getPackageRootPath`)) {
        stopifnot(R6::is.R6(`getPackageRootPath`))
        self$`getPackageRootPath` <- `getPackageRootPath`
      }
    },
    toJSON = function() {
      ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject <- list()
      if (!is.null(self$`getSystemWorkflowModels`)) {
        ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject[['getSystemWorkflowModels']] <- self$`getSystemWorkflowModels`$toJSON()
      }
      if (!is.null(self$`getPackageRootPath`)) {
        ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject[['getPackageRootPath']] <- self$`getPackageRootPath`$toJSON()
      }

      ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject
    },
    fromJSON = function(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesJson) {
      ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesJson)
      if (!is.null(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject$`getSystemWorkflowModels`)) {
        getSystemWorkflowModelsObject <- ConfigNodePropertyArray$new()
        getSystemWorkflowModelsObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject$getSystemWorkflowModels, auto_unbox = TRUE))
        self$`getSystemWorkflowModels` <- getSystemWorkflowModelsObject
      }
      if (!is.null(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject$`getPackageRootPath`)) {
        getPackageRootPathObject <- ConfigNodePropertyString$new()
        getPackageRootPathObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject$getPackageRootPath, auto_unbox = TRUE))
        self$`getPackageRootPath` <- getPackageRootPathObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "getSystemWorkflowModels": %s,
           "getPackageRootPath": %s
        }',
        self$`getSystemWorkflowModels`$toJSON(),
        self$`getPackageRootPath`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesJson) {
      ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`getSystemWorkflowModels` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject$getSystemWorkflowModels, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`getPackageRootPath` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesObject$getPackageRootPath, auto_unbox = TRUE))
    }
  )
)