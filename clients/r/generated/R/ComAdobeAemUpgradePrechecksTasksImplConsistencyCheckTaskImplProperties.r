# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties Class
#'
#' @field root.path 
#' @field fix.inconsistencies 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties <- R6::R6Class(
  'ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties',
  public = list(
    `root.path` = NULL,
    `fix.inconsistencies` = NULL,
    initialize = function(`root.path`, `fix.inconsistencies`){
      if (!missing(`root.path`)) {
        stopifnot(R6::is.R6(`root.path`))
        self$`root.path` <- `root.path`
      }
      if (!missing(`fix.inconsistencies`)) {
        stopifnot(R6::is.R6(`fix.inconsistencies`))
        self$`fix.inconsistencies` <- `fix.inconsistencies`
      }
    },
    toJSON = function() {
      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject <- list()
      if (!is.null(self$`root.path`)) {
        ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject[['root.path']] <- self$`root.path`$toJSON()
      }
      if (!is.null(self$`fix.inconsistencies`)) {
        ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject[['fix.inconsistencies']] <- self$`fix.inconsistencies`$toJSON()
      }

      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject
    },
    fromJSON = function(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesJson) {
      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject <- jsonlite::fromJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesJson)
      if (!is.null(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject$`root.path`)) {
        root.pathObject <- ConfigNodePropertyString$new()
        root.pathObject$fromJSON(jsonlite::toJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject$root.path, auto_unbox = TRUE))
        self$`root.path` <- root.pathObject
      }
      if (!is.null(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject$`fix.inconsistencies`)) {
        fix.inconsistenciesObject <- ConfigNodePropertyBoolean$new()
        fix.inconsistenciesObject$fromJSON(jsonlite::toJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject$fix.inconsistencies, auto_unbox = TRUE))
        self$`fix.inconsistencies` <- fix.inconsistenciesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "root.path": %s,
           "fix.inconsistencies": %s
        }',
        self$`root.path`$toJSON(),
        self$`fix.inconsistencies`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesJson) {
      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject <- jsonlite::fromJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`root.path` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject$root.path, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`fix.inconsistencies` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesObject$fix.inconsistencies, auto_unbox = TRUE))
    }
  )
)