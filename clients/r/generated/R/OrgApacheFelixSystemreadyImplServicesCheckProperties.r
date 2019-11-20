# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheFelixSystemreadyImplServicesCheckProperties Class
#'
#' @field services.list 
#' @field type 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheFelixSystemreadyImplServicesCheckProperties <- R6::R6Class(
  'OrgApacheFelixSystemreadyImplServicesCheckProperties',
  public = list(
    `services.list` = NULL,
    `type` = NULL,
    initialize = function(`services.list`, `type`){
      if (!missing(`services.list`)) {
        stopifnot(R6::is.R6(`services.list`))
        self$`services.list` <- `services.list`
      }
      if (!missing(`type`)) {
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
    },
    toJSON = function() {
      OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject <- list()
      if (!is.null(self$`services.list`)) {
        OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject[['services.list']] <- self$`services.list`$toJSON()
      }
      if (!is.null(self$`type`)) {
        OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject[['type']] <- self$`type`$toJSON()
      }

      OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject
    },
    fromJSON = function(OrgApacheFelixSystemreadyImplServicesCheckPropertiesJson) {
      OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject <- jsonlite::fromJSON(OrgApacheFelixSystemreadyImplServicesCheckPropertiesJson)
      if (!is.null(OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject$`services.list`)) {
        services.listObject <- ConfigNodePropertyArray$new()
        services.listObject$fromJSON(jsonlite::toJSON(OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject$services.list, auto_unbox = TRUE))
        self$`services.list` <- services.listObject
      }
      if (!is.null(OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject$`type`)) {
        typeObject <- ConfigNodePropertyDropDown$new()
        typeObject$fromJSON(jsonlite::toJSON(OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject$type, auto_unbox = TRUE))
        self$`type` <- typeObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "services.list": %s,
           "type": %s
        }',
        self$`services.list`$toJSON(),
        self$`type`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheFelixSystemreadyImplServicesCheckPropertiesJson) {
      OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject <- jsonlite::fromJSON(OrgApacheFelixSystemreadyImplServicesCheckPropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`services.list` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject$services.list, auto_unbox = TRUE))
      ConfigNodePropertyDropDownObject <- ConfigNodePropertyDropDown$new()
      self$`type` <- ConfigNodePropertyDropDownObject$fromJSON(jsonlite::toJSON(OrgApacheFelixSystemreadyImplServicesCheckPropertiesObject$type, auto_unbox = TRUE))
    }
  )
)