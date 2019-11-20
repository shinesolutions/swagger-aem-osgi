# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo <- R6::R6Class(
  'ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo',
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
      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject
    },
    fromJSON = function(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoJson) {
      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject <- jsonlite::fromJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoJson)
      if (!is.null(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`pid`)) {
        self$`pid` <- ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`pid`
      }
      if (!is.null(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`title`)) {
        self$`title` <- ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`title`
      }
      if (!is.null(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`description`)) {
        self$`description` <- ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`description`
      }
      if (!is.null(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`properties`)) {
        propertiesObject <- ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoJson) {
      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject <- jsonlite::fromJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoJson)
      self$`pid` <- ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`pid`
      self$`title` <- ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`title`
      self$`description` <- ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$`description`
      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject <- ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties$new()
      self$`properties` <- ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoObject$properties, auto_unbox = TRUE))
    }
  )
)