# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingResourcemergerPickerOverridingProperties Class
#'
#' @field merge.root 
#' @field merge.readOnly 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheSlingResourcemergerPickerOverridingProperties <- R6::R6Class(
  'OrgApacheSlingResourcemergerPickerOverridingProperties',
  public = list(
    `merge.root` = NULL,
    `merge.readOnly` = NULL,
    initialize = function(`merge.root`, `merge.readOnly`){
      if (!missing(`merge.root`)) {
        stopifnot(R6::is.R6(`merge.root`))
        self$`merge.root` <- `merge.root`
      }
      if (!missing(`merge.readOnly`)) {
        stopifnot(R6::is.R6(`merge.readOnly`))
        self$`merge.readOnly` <- `merge.readOnly`
      }
    },
    toJSON = function() {
      OrgApacheSlingResourcemergerPickerOverridingPropertiesObject <- list()
      if (!is.null(self$`merge.root`)) {
        OrgApacheSlingResourcemergerPickerOverridingPropertiesObject[['merge.root']] <- self$`merge.root`$toJSON()
      }
      if (!is.null(self$`merge.readOnly`)) {
        OrgApacheSlingResourcemergerPickerOverridingPropertiesObject[['merge.readOnly']] <- self$`merge.readOnly`$toJSON()
      }

      OrgApacheSlingResourcemergerPickerOverridingPropertiesObject
    },
    fromJSON = function(OrgApacheSlingResourcemergerPickerOverridingPropertiesJson) {
      OrgApacheSlingResourcemergerPickerOverridingPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingResourcemergerPickerOverridingPropertiesJson)
      if (!is.null(OrgApacheSlingResourcemergerPickerOverridingPropertiesObject$`merge.root`)) {
        merge.rootObject <- ConfigNodePropertyString$new()
        merge.rootObject$fromJSON(jsonlite::toJSON(OrgApacheSlingResourcemergerPickerOverridingPropertiesObject$merge.root, auto_unbox = TRUE))
        self$`merge.root` <- merge.rootObject
      }
      if (!is.null(OrgApacheSlingResourcemergerPickerOverridingPropertiesObject$`merge.readOnly`)) {
        merge.readOnlyObject <- ConfigNodePropertyBoolean$new()
        merge.readOnlyObject$fromJSON(jsonlite::toJSON(OrgApacheSlingResourcemergerPickerOverridingPropertiesObject$merge.readOnly, auto_unbox = TRUE))
        self$`merge.readOnly` <- merge.readOnlyObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "merge.root": %s,
           "merge.readOnly": %s
        }',
        self$`merge.root`$toJSON(),
        self$`merge.readOnly`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheSlingResourcemergerPickerOverridingPropertiesJson) {
      OrgApacheSlingResourcemergerPickerOverridingPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingResourcemergerPickerOverridingPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`merge.root` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheSlingResourcemergerPickerOverridingPropertiesObject$merge.root, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`merge.readOnly` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheSlingResourcemergerPickerOverridingPropertiesObject$merge.readOnly, auto_unbox = TRUE))
    }
  )
)