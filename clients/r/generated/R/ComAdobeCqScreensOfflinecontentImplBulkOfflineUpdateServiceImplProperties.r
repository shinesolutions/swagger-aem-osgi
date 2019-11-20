# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties Class
#'
#' @field com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath 
#' @field com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties <- R6::R6Class(
  'ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties',
  public = list(
    `com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath` = NULL,
    `com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency` = NULL,
    initialize = function(`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`, `com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`){
      if (!missing(`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`)) {
        stopifnot(R6::is.R6(`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`))
        self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath` <- `com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`
      }
      if (!missing(`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`)) {
        stopifnot(R6::is.R6(`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`))
        self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency` <- `com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`
      }
    },
    toJSON = function() {
      ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject <- list()
      if (!is.null(self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`)) {
        ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject[['com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath']] <- self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`$toJSON()
      }
      if (!is.null(self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`)) {
        ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject[['com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency']] <- self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`$toJSON()
      }

      ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject
    },
    fromJSON = function(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesJson) {
      ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject <- jsonlite::fromJSON(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesJson)
      if (!is.null(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`)) {
        com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPathObject <- ConfigNodePropertyArray$new()
        com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPathObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject$com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath, auto_unbox = TRUE))
        self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath` <- com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPathObject
      }
      if (!is.null(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`)) {
        com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequencyObject <- ConfigNodePropertyString$new()
        com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequencyObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject$com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency, auto_unbox = TRUE))
        self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency` <- com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequencyObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath": %s,
           "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency": %s
        }',
        self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`$toJSON(),
        self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesJson) {
      ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject <- jsonlite::fromJSON(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject$com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesObject$com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency, auto_unbox = TRUE))
    }
  )
)