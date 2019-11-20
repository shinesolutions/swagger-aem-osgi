# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqDamCoreImplServletAssetDownloadServletProperties Class
#'
#' @field enabled 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqDamCoreImplServletAssetDownloadServletProperties <- R6::R6Class(
  'ComDayCqDamCoreImplServletAssetDownloadServletProperties',
  public = list(
    `enabled` = NULL,
    initialize = function(`enabled`){
      if (!missing(`enabled`)) {
        stopifnot(R6::is.R6(`enabled`))
        self$`enabled` <- `enabled`
      }
    },
    toJSON = function() {
      ComDayCqDamCoreImplServletAssetDownloadServletPropertiesObject <- list()
      if (!is.null(self$`enabled`)) {
        ComDayCqDamCoreImplServletAssetDownloadServletPropertiesObject[['enabled']] <- self$`enabled`$toJSON()
      }

      ComDayCqDamCoreImplServletAssetDownloadServletPropertiesObject
    },
    fromJSON = function(ComDayCqDamCoreImplServletAssetDownloadServletPropertiesJson) {
      ComDayCqDamCoreImplServletAssetDownloadServletPropertiesObject <- jsonlite::fromJSON(ComDayCqDamCoreImplServletAssetDownloadServletPropertiesJson)
      if (!is.null(ComDayCqDamCoreImplServletAssetDownloadServletPropertiesObject$`enabled`)) {
        enabledObject <- ConfigNodePropertyBoolean$new()
        enabledObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplServletAssetDownloadServletPropertiesObject$enabled, auto_unbox = TRUE))
        self$`enabled` <- enabledObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "enabled": %s
        }',
        self$`enabled`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqDamCoreImplServletAssetDownloadServletPropertiesJson) {
      ComDayCqDamCoreImplServletAssetDownloadServletPropertiesObject <- jsonlite::fromJSON(ComDayCqDamCoreImplServletAssetDownloadServletPropertiesJson)
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`enabled` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplServletAssetDownloadServletPropertiesObject$enabled, auto_unbox = TRUE))
    }
  )
)