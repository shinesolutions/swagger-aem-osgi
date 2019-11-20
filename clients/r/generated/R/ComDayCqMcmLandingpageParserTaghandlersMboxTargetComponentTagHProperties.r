# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties Class
#'
#' @field service.ranking 
#' @field tagpattern 
#' @field component.resourceType 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties <- R6::R6Class(
  'ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties',
  public = list(
    `service.ranking` = NULL,
    `tagpattern` = NULL,
    `component.resourceType` = NULL,
    initialize = function(`service.ranking`, `tagpattern`, `component.resourceType`){
      if (!missing(`service.ranking`)) {
        stopifnot(R6::is.R6(`service.ranking`))
        self$`service.ranking` <- `service.ranking`
      }
      if (!missing(`tagpattern`)) {
        stopifnot(R6::is.R6(`tagpattern`))
        self$`tagpattern` <- `tagpattern`
      }
      if (!missing(`component.resourceType`)) {
        stopifnot(R6::is.R6(`component.resourceType`))
        self$`component.resourceType` <- `component.resourceType`
      }
    },
    toJSON = function() {
      ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject <- list()
      if (!is.null(self$`service.ranking`)) {
        ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject[['service.ranking']] <- self$`service.ranking`$toJSON()
      }
      if (!is.null(self$`tagpattern`)) {
        ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject[['tagpattern']] <- self$`tagpattern`$toJSON()
      }
      if (!is.null(self$`component.resourceType`)) {
        ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject[['component.resourceType']] <- self$`component.resourceType`$toJSON()
      }

      ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject
    },
    fromJSON = function(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesJson) {
      ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject <- jsonlite::fromJSON(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesJson)
      if (!is.null(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject$`service.ranking`)) {
        service.rankingObject <- ConfigNodePropertyInteger$new()
        service.rankingObject$fromJSON(jsonlite::toJSON(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject$service.ranking, auto_unbox = TRUE))
        self$`service.ranking` <- service.rankingObject
      }
      if (!is.null(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject$`tagpattern`)) {
        tagpatternObject <- ConfigNodePropertyString$new()
        tagpatternObject$fromJSON(jsonlite::toJSON(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject$tagpattern, auto_unbox = TRUE))
        self$`tagpattern` <- tagpatternObject
      }
      if (!is.null(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject$`component.resourceType`)) {
        component.resourceTypeObject <- ConfigNodePropertyString$new()
        component.resourceTypeObject$fromJSON(jsonlite::toJSON(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject$component.resourceType, auto_unbox = TRUE))
        self$`component.resourceType` <- component.resourceTypeObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "service.ranking": %s,
           "tagpattern": %s,
           "component.resourceType": %s
        }',
        self$`service.ranking`$toJSON(),
        self$`tagpattern`$toJSON(),
        self$`component.resourceType`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesJson) {
      ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject <- jsonlite::fromJSON(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesJson)
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`service.ranking` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject$service.ranking, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`tagpattern` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject$tagpattern, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`component.resourceType` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesObject$component.resourceType, auto_unbox = TRUE))
    }
  )
)