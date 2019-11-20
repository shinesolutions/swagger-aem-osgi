# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqWcmFoundationImplPageImpressionsTrackerProperties Class
#'
#' @field sling.auth.requirements 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties <- R6::R6Class(
  'ComDayCqWcmFoundationImplPageImpressionsTrackerProperties',
  public = list(
    `sling.auth.requirements` = NULL,
    initialize = function(`sling.auth.requirements`){
      if (!missing(`sling.auth.requirements`)) {
        stopifnot(R6::is.R6(`sling.auth.requirements`))
        self$`sling.auth.requirements` <- `sling.auth.requirements`
      }
    },
    toJSON = function() {
      ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesObject <- list()
      if (!is.null(self$`sling.auth.requirements`)) {
        ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesObject[['sling.auth.requirements']] <- self$`sling.auth.requirements`$toJSON()
      }

      ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesObject
    },
    fromJSON = function(ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesJson) {
      ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesObject <- jsonlite::fromJSON(ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesJson)
      if (!is.null(ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesObject$`sling.auth.requirements`)) {
        sling.auth.requirementsObject <- ConfigNodePropertyString$new()
        sling.auth.requirementsObject$fromJSON(jsonlite::toJSON(ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesObject$sling.auth.requirements, auto_unbox = TRUE))
        self$`sling.auth.requirements` <- sling.auth.requirementsObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "sling.auth.requirements": %s
        }',
        self$`sling.auth.requirements`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesJson) {
      ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesObject <- jsonlite::fromJSON(ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`sling.auth.requirements` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesObject$sling.auth.requirements, auto_unbox = TRUE))
    }
  )
)