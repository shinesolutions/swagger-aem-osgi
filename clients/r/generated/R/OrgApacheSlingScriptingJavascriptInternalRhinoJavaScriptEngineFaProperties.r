# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties Class
#'
#' @field org.apache.sling.scripting.javascript.rhino.optLevel 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties <- R6::R6Class(
  'OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties',
  public = list(
    `org.apache.sling.scripting.javascript.rhino.optLevel` = NULL,
    initialize = function(`org.apache.sling.scripting.javascript.rhino.optLevel`){
      if (!missing(`org.apache.sling.scripting.javascript.rhino.optLevel`)) {
        stopifnot(R6::is.R6(`org.apache.sling.scripting.javascript.rhino.optLevel`))
        self$`org.apache.sling.scripting.javascript.rhino.optLevel` <- `org.apache.sling.scripting.javascript.rhino.optLevel`
      }
    },
    toJSON = function() {
      OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesObject <- list()
      if (!is.null(self$`org.apache.sling.scripting.javascript.rhino.optLevel`)) {
        OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesObject[['org.apache.sling.scripting.javascript.rhino.optLevel']] <- self$`org.apache.sling.scripting.javascript.rhino.optLevel`$toJSON()
      }

      OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesObject
    },
    fromJSON = function(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesJson) {
      OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesJson)
      if (!is.null(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesObject$`org.apache.sling.scripting.javascript.rhino.optLevel`)) {
        org.apache.sling.scripting.javascript.rhino.optLevelObject <- ConfigNodePropertyInteger$new()
        org.apache.sling.scripting.javascript.rhino.optLevelObject$fromJSON(jsonlite::toJSON(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesObject$org.apache.sling.scripting.javascript.rhino.optLevel, auto_unbox = TRUE))
        self$`org.apache.sling.scripting.javascript.rhino.optLevel` <- org.apache.sling.scripting.javascript.rhino.optLevelObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "org.apache.sling.scripting.javascript.rhino.optLevel": %s
        }',
        self$`org.apache.sling.scripting.javascript.rhino.optLevel`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesJson) {
      OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesJson)
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`org.apache.sling.scripting.javascript.rhino.optLevel` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesObject$org.apache.sling.scripting.javascript.rhino.optLevel, auto_unbox = TRUE))
    }
  )
)