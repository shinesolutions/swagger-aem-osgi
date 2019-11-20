# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingFeatureflagsFeatureProperties Class
#'
#' @field name 
#' @field description 
#' @field enabled 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheSlingFeatureflagsFeatureProperties <- R6::R6Class(
  'OrgApacheSlingFeatureflagsFeatureProperties',
  public = list(
    `name` = NULL,
    `description` = NULL,
    `enabled` = NULL,
    initialize = function(`name`, `description`, `enabled`){
      if (!missing(`name`)) {
        stopifnot(R6::is.R6(`name`))
        self$`name` <- `name`
      }
      if (!missing(`description`)) {
        stopifnot(R6::is.R6(`description`))
        self$`description` <- `description`
      }
      if (!missing(`enabled`)) {
        stopifnot(R6::is.R6(`enabled`))
        self$`enabled` <- `enabled`
      }
    },
    toJSON = function() {
      OrgApacheSlingFeatureflagsFeaturePropertiesObject <- list()
      if (!is.null(self$`name`)) {
        OrgApacheSlingFeatureflagsFeaturePropertiesObject[['name']] <- self$`name`$toJSON()
      }
      if (!is.null(self$`description`)) {
        OrgApacheSlingFeatureflagsFeaturePropertiesObject[['description']] <- self$`description`$toJSON()
      }
      if (!is.null(self$`enabled`)) {
        OrgApacheSlingFeatureflagsFeaturePropertiesObject[['enabled']] <- self$`enabled`$toJSON()
      }

      OrgApacheSlingFeatureflagsFeaturePropertiesObject
    },
    fromJSON = function(OrgApacheSlingFeatureflagsFeaturePropertiesJson) {
      OrgApacheSlingFeatureflagsFeaturePropertiesObject <- jsonlite::fromJSON(OrgApacheSlingFeatureflagsFeaturePropertiesJson)
      if (!is.null(OrgApacheSlingFeatureflagsFeaturePropertiesObject$`name`)) {
        nameObject <- ConfigNodePropertyString$new()
        nameObject$fromJSON(jsonlite::toJSON(OrgApacheSlingFeatureflagsFeaturePropertiesObject$name, auto_unbox = TRUE))
        self$`name` <- nameObject
      }
      if (!is.null(OrgApacheSlingFeatureflagsFeaturePropertiesObject$`description`)) {
        descriptionObject <- ConfigNodePropertyString$new()
        descriptionObject$fromJSON(jsonlite::toJSON(OrgApacheSlingFeatureflagsFeaturePropertiesObject$description, auto_unbox = TRUE))
        self$`description` <- descriptionObject
      }
      if (!is.null(OrgApacheSlingFeatureflagsFeaturePropertiesObject$`enabled`)) {
        enabledObject <- ConfigNodePropertyBoolean$new()
        enabledObject$fromJSON(jsonlite::toJSON(OrgApacheSlingFeatureflagsFeaturePropertiesObject$enabled, auto_unbox = TRUE))
        self$`enabled` <- enabledObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "name": %s,
           "description": %s,
           "enabled": %s
        }',
        self$`name`$toJSON(),
        self$`description`$toJSON(),
        self$`enabled`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheSlingFeatureflagsFeaturePropertiesJson) {
      OrgApacheSlingFeatureflagsFeaturePropertiesObject <- jsonlite::fromJSON(OrgApacheSlingFeatureflagsFeaturePropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`name` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheSlingFeatureflagsFeaturePropertiesObject$name, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`description` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheSlingFeatureflagsFeaturePropertiesObject$description, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`enabled` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheSlingFeatureflagsFeaturePropertiesObject$enabled, auto_unbox = TRUE))
    }
  )
)