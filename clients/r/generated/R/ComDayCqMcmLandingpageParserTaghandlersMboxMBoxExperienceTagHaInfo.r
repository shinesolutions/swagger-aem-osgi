# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo <- R6::R6Class(
  'ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo',
  public = list(
    `pid` = NULL,
    `title` = NULL,
    `description` = NULL,
    `properties` = NULL,
    initialize = function(`pid`, `title`, `description`, `properties`){
      if (!missing(`pid`)) {
        stopifnot(is.character(`pid`), length(`pid`) == 1)
        self$`pid` <- `pid`
      }
      if (!missing(`title`)) {
        stopifnot(is.character(`title`), length(`title`) == 1)
        self$`title` <- `title`
      }
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`properties`)) {
        stopifnot(R6::is.R6(`properties`))
        self$`properties` <- `properties`
      }
    },
    toJSON = function() {
      ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject
    },
    fromJSON = function(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoJson) {
      ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject <- jsonlite::fromJSON(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoJson)
      if (!is.null(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`pid`)) {
        self$`pid` <- ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`pid`
      }
      if (!is.null(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`title`)) {
        self$`title` <- ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`title`
      }
      if (!is.null(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`description`)) {
        self$`description` <- ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`description`
      }
      if (!is.null(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`properties`)) {
        propertiesObject <- ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$properties, auto_unbox = TRUE))
        self$`properties` <- propertiesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "pid": %s,
           "title": %s,
           "description": %s,
           "properties": %s
        }',
        self$`pid`,
        self$`title`,
        self$`description`,
        self$`properties`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoJson) {
      ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject <- jsonlite::fromJSON(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoJson)
      self$`pid` <- ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`pid`
      self$`title` <- ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`title`
      self$`description` <- ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$`description`
      ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesObject <- ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties$new()
      self$`properties` <- ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoObject$properties, auto_unbox = TRUE))
    }
  )
)