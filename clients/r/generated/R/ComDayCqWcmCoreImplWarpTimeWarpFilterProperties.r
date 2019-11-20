# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqWcmCoreImplWarpTimeWarpFilterProperties Class
#'
#' @field filter.order 
#' @field filter.scope 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqWcmCoreImplWarpTimeWarpFilterProperties <- R6::R6Class(
  'ComDayCqWcmCoreImplWarpTimeWarpFilterProperties',
  public = list(
    `filter.order` = NULL,
    `filter.scope` = NULL,
    initialize = function(`filter.order`, `filter.scope`){
      if (!missing(`filter.order`)) {
        stopifnot(R6::is.R6(`filter.order`))
        self$`filter.order` <- `filter.order`
      }
      if (!missing(`filter.scope`)) {
        stopifnot(R6::is.R6(`filter.scope`))
        self$`filter.scope` <- `filter.scope`
      }
    },
    toJSON = function() {
      ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject <- list()
      if (!is.null(self$`filter.order`)) {
        ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject[['filter.order']] <- self$`filter.order`$toJSON()
      }
      if (!is.null(self$`filter.scope`)) {
        ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject[['filter.scope']] <- self$`filter.scope`$toJSON()
      }

      ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject
    },
    fromJSON = function(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesJson) {
      ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject <- jsonlite::fromJSON(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesJson)
      if (!is.null(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject$`filter.order`)) {
        filter.orderObject <- ConfigNodePropertyString$new()
        filter.orderObject$fromJSON(jsonlite::toJSON(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject$filter.order, auto_unbox = TRUE))
        self$`filter.order` <- filter.orderObject
      }
      if (!is.null(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject$`filter.scope`)) {
        filter.scopeObject <- ConfigNodePropertyString$new()
        filter.scopeObject$fromJSON(jsonlite::toJSON(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject$filter.scope, auto_unbox = TRUE))
        self$`filter.scope` <- filter.scopeObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "filter.order": %s,
           "filter.scope": %s
        }',
        self$`filter.order`$toJSON(),
        self$`filter.scope`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesJson) {
      ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject <- jsonlite::fromJSON(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`filter.order` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject$filter.order, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`filter.scope` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesObject$filter.scope, auto_unbox = TRUE))
    }
  )
)