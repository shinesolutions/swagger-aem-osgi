# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingHapiImplHApiUtilImplProperties Class
#'
#' @field org.apache.sling.hapi.tools.resourcetype 
#' @field org.apache.sling.hapi.tools.collectionresourcetype 
#' @field org.apache.sling.hapi.tools.searchpaths 
#' @field org.apache.sling.hapi.tools.externalurl 
#' @field org.apache.sling.hapi.tools.enabled 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheSlingHapiImplHApiUtilImplProperties <- R6::R6Class(
  'OrgApacheSlingHapiImplHApiUtilImplProperties',
  public = list(
    `org.apache.sling.hapi.tools.resourcetype` = NULL,
    `org.apache.sling.hapi.tools.collectionresourcetype` = NULL,
    `org.apache.sling.hapi.tools.searchpaths` = NULL,
    `org.apache.sling.hapi.tools.externalurl` = NULL,
    `org.apache.sling.hapi.tools.enabled` = NULL,
    initialize = function(`org.apache.sling.hapi.tools.resourcetype`, `org.apache.sling.hapi.tools.collectionresourcetype`, `org.apache.sling.hapi.tools.searchpaths`, `org.apache.sling.hapi.tools.externalurl`, `org.apache.sling.hapi.tools.enabled`){
      if (!missing(`org.apache.sling.hapi.tools.resourcetype`)) {
        stopifnot(R6::is.R6(`org.apache.sling.hapi.tools.resourcetype`))
        self$`org.apache.sling.hapi.tools.resourcetype` <- `org.apache.sling.hapi.tools.resourcetype`
      }
      if (!missing(`org.apache.sling.hapi.tools.collectionresourcetype`)) {
        stopifnot(R6::is.R6(`org.apache.sling.hapi.tools.collectionresourcetype`))
        self$`org.apache.sling.hapi.tools.collectionresourcetype` <- `org.apache.sling.hapi.tools.collectionresourcetype`
      }
      if (!missing(`org.apache.sling.hapi.tools.searchpaths`)) {
        stopifnot(R6::is.R6(`org.apache.sling.hapi.tools.searchpaths`))
        self$`org.apache.sling.hapi.tools.searchpaths` <- `org.apache.sling.hapi.tools.searchpaths`
      }
      if (!missing(`org.apache.sling.hapi.tools.externalurl`)) {
        stopifnot(R6::is.R6(`org.apache.sling.hapi.tools.externalurl`))
        self$`org.apache.sling.hapi.tools.externalurl` <- `org.apache.sling.hapi.tools.externalurl`
      }
      if (!missing(`org.apache.sling.hapi.tools.enabled`)) {
        stopifnot(R6::is.R6(`org.apache.sling.hapi.tools.enabled`))
        self$`org.apache.sling.hapi.tools.enabled` <- `org.apache.sling.hapi.tools.enabled`
      }
    },
    toJSON = function() {
      OrgApacheSlingHapiImplHApiUtilImplPropertiesObject <- list()
      if (!is.null(self$`org.apache.sling.hapi.tools.resourcetype`)) {
        OrgApacheSlingHapiImplHApiUtilImplPropertiesObject[['org.apache.sling.hapi.tools.resourcetype']] <- self$`org.apache.sling.hapi.tools.resourcetype`$toJSON()
      }
      if (!is.null(self$`org.apache.sling.hapi.tools.collectionresourcetype`)) {
        OrgApacheSlingHapiImplHApiUtilImplPropertiesObject[['org.apache.sling.hapi.tools.collectionresourcetype']] <- self$`org.apache.sling.hapi.tools.collectionresourcetype`$toJSON()
      }
      if (!is.null(self$`org.apache.sling.hapi.tools.searchpaths`)) {
        OrgApacheSlingHapiImplHApiUtilImplPropertiesObject[['org.apache.sling.hapi.tools.searchpaths']] <- self$`org.apache.sling.hapi.tools.searchpaths`$toJSON()
      }
      if (!is.null(self$`org.apache.sling.hapi.tools.externalurl`)) {
        OrgApacheSlingHapiImplHApiUtilImplPropertiesObject[['org.apache.sling.hapi.tools.externalurl']] <- self$`org.apache.sling.hapi.tools.externalurl`$toJSON()
      }
      if (!is.null(self$`org.apache.sling.hapi.tools.enabled`)) {
        OrgApacheSlingHapiImplHApiUtilImplPropertiesObject[['org.apache.sling.hapi.tools.enabled']] <- self$`org.apache.sling.hapi.tools.enabled`$toJSON()
      }

      OrgApacheSlingHapiImplHApiUtilImplPropertiesObject
    },
    fromJSON = function(OrgApacheSlingHapiImplHApiUtilImplPropertiesJson) {
      OrgApacheSlingHapiImplHApiUtilImplPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesJson)
      if (!is.null(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$`org.apache.sling.hapi.tools.resourcetype`)) {
        org.apache.sling.hapi.tools.resourcetypeObject <- ConfigNodePropertyString$new()
        org.apache.sling.hapi.tools.resourcetypeObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.resourcetype, auto_unbox = TRUE))
        self$`org.apache.sling.hapi.tools.resourcetype` <- org.apache.sling.hapi.tools.resourcetypeObject
      }
      if (!is.null(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$`org.apache.sling.hapi.tools.collectionresourcetype`)) {
        org.apache.sling.hapi.tools.collectionresourcetypeObject <- ConfigNodePropertyString$new()
        org.apache.sling.hapi.tools.collectionresourcetypeObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.collectionresourcetype, auto_unbox = TRUE))
        self$`org.apache.sling.hapi.tools.collectionresourcetype` <- org.apache.sling.hapi.tools.collectionresourcetypeObject
      }
      if (!is.null(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$`org.apache.sling.hapi.tools.searchpaths`)) {
        org.apache.sling.hapi.tools.searchpathsObject <- ConfigNodePropertyArray$new()
        org.apache.sling.hapi.tools.searchpathsObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.searchpaths, auto_unbox = TRUE))
        self$`org.apache.sling.hapi.tools.searchpaths` <- org.apache.sling.hapi.tools.searchpathsObject
      }
      if (!is.null(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$`org.apache.sling.hapi.tools.externalurl`)) {
        org.apache.sling.hapi.tools.externalurlObject <- ConfigNodePropertyString$new()
        org.apache.sling.hapi.tools.externalurlObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.externalurl, auto_unbox = TRUE))
        self$`org.apache.sling.hapi.tools.externalurl` <- org.apache.sling.hapi.tools.externalurlObject
      }
      if (!is.null(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$`org.apache.sling.hapi.tools.enabled`)) {
        org.apache.sling.hapi.tools.enabledObject <- ConfigNodePropertyBoolean$new()
        org.apache.sling.hapi.tools.enabledObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.enabled, auto_unbox = TRUE))
        self$`org.apache.sling.hapi.tools.enabled` <- org.apache.sling.hapi.tools.enabledObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "org.apache.sling.hapi.tools.resourcetype": %s,
           "org.apache.sling.hapi.tools.collectionresourcetype": %s,
           "org.apache.sling.hapi.tools.searchpaths": %s,
           "org.apache.sling.hapi.tools.externalurl": %s,
           "org.apache.sling.hapi.tools.enabled": %s
        }',
        self$`org.apache.sling.hapi.tools.resourcetype`$toJSON(),
        self$`org.apache.sling.hapi.tools.collectionresourcetype`$toJSON(),
        self$`org.apache.sling.hapi.tools.searchpaths`$toJSON(),
        self$`org.apache.sling.hapi.tools.externalurl`$toJSON(),
        self$`org.apache.sling.hapi.tools.enabled`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheSlingHapiImplHApiUtilImplPropertiesJson) {
      OrgApacheSlingHapiImplHApiUtilImplPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`org.apache.sling.hapi.tools.resourcetype` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.resourcetype, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`org.apache.sling.hapi.tools.collectionresourcetype` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.collectionresourcetype, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`org.apache.sling.hapi.tools.searchpaths` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.searchpaths, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`org.apache.sling.hapi.tools.externalurl` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.externalurl, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`org.apache.sling.hapi.tools.enabled` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheSlingHapiImplHApiUtilImplPropertiesObject$org.apache.sling.hapi.tools.enabled, auto_unbox = TRUE))
    }
  )
)