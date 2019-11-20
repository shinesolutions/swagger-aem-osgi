# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties Class
#'
#' @field cq.dam.drm.enable 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties <- R6::R6Class(
  'ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties',
  public = list(
    `cq.dam.drm.enable` = NULL,
    initialize = function(`cq.dam.drm.enable`){
      if (!missing(`cq.dam.drm.enable`)) {
        stopifnot(R6::is.R6(`cq.dam.drm.enable`))
        self$`cq.dam.drm.enable` <- `cq.dam.drm.enable`
      }
    },
    toJSON = function() {
      ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesObject <- list()
      if (!is.null(self$`cq.dam.drm.enable`)) {
        ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesObject[['cq.dam.drm.enable']] <- self$`cq.dam.drm.enable`$toJSON()
      }

      ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesObject
    },
    fromJSON = function(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesJson) {
      ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesObject <- jsonlite::fromJSON(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesJson)
      if (!is.null(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesObject$`cq.dam.drm.enable`)) {
        cq.dam.drm.enableObject <- ConfigNodePropertyBoolean$new()
        cq.dam.drm.enableObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesObject$cq.dam.drm.enable, auto_unbox = TRUE))
        self$`cq.dam.drm.enable` <- cq.dam.drm.enableObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "cq.dam.drm.enable": %s
        }',
        self$`cq.dam.drm.enable`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesJson) {
      ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesObject <- jsonlite::fromJSON(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesJson)
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`cq.dam.drm.enable` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesObject$cq.dam.drm.enable, auto_unbox = TRUE))
    }
  )
)