# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties Class
#'
#' @field translationFactory 
#' @field defaultConnectorLabel 
#' @field defaultConnectorAttribution 
#' @field defaultConnectorWorkspaceId 
#' @field defaultConnectorSubscriptionKey 
#' @field languageMapLocation 
#' @field categoryMapLocation 
#' @field retryAttempts 
#' @field timeoutCount 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties <- R6::R6Class(
  'ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties',
  public = list(
    `translationFactory` = NULL,
    `defaultConnectorLabel` = NULL,
    `defaultConnectorAttribution` = NULL,
    `defaultConnectorWorkspaceId` = NULL,
    `defaultConnectorSubscriptionKey` = NULL,
    `languageMapLocation` = NULL,
    `categoryMapLocation` = NULL,
    `retryAttempts` = NULL,
    `timeoutCount` = NULL,
    initialize = function(`translationFactory`, `defaultConnectorLabel`, `defaultConnectorAttribution`, `defaultConnectorWorkspaceId`, `defaultConnectorSubscriptionKey`, `languageMapLocation`, `categoryMapLocation`, `retryAttempts`, `timeoutCount`){
      if (!missing(`translationFactory`)) {
        stopifnot(R6::is.R6(`translationFactory`))
        self$`translationFactory` <- `translationFactory`
      }
      if (!missing(`defaultConnectorLabel`)) {
        stopifnot(R6::is.R6(`defaultConnectorLabel`))
        self$`defaultConnectorLabel` <- `defaultConnectorLabel`
      }
      if (!missing(`defaultConnectorAttribution`)) {
        stopifnot(R6::is.R6(`defaultConnectorAttribution`))
        self$`defaultConnectorAttribution` <- `defaultConnectorAttribution`
      }
      if (!missing(`defaultConnectorWorkspaceId`)) {
        stopifnot(R6::is.R6(`defaultConnectorWorkspaceId`))
        self$`defaultConnectorWorkspaceId` <- `defaultConnectorWorkspaceId`
      }
      if (!missing(`defaultConnectorSubscriptionKey`)) {
        stopifnot(R6::is.R6(`defaultConnectorSubscriptionKey`))
        self$`defaultConnectorSubscriptionKey` <- `defaultConnectorSubscriptionKey`
      }
      if (!missing(`languageMapLocation`)) {
        stopifnot(R6::is.R6(`languageMapLocation`))
        self$`languageMapLocation` <- `languageMapLocation`
      }
      if (!missing(`categoryMapLocation`)) {
        stopifnot(R6::is.R6(`categoryMapLocation`))
        self$`categoryMapLocation` <- `categoryMapLocation`
      }
      if (!missing(`retryAttempts`)) {
        stopifnot(R6::is.R6(`retryAttempts`))
        self$`retryAttempts` <- `retryAttempts`
      }
      if (!missing(`timeoutCount`)) {
        stopifnot(R6::is.R6(`timeoutCount`))
        self$`timeoutCount` <- `timeoutCount`
      }
    },
    toJSON = function() {
      ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject <- list()
      if (!is.null(self$`translationFactory`)) {
        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject[['translationFactory']] <- self$`translationFactory`$toJSON()
      }
      if (!is.null(self$`defaultConnectorLabel`)) {
        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject[['defaultConnectorLabel']] <- self$`defaultConnectorLabel`$toJSON()
      }
      if (!is.null(self$`defaultConnectorAttribution`)) {
        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject[['defaultConnectorAttribution']] <- self$`defaultConnectorAttribution`$toJSON()
      }
      if (!is.null(self$`defaultConnectorWorkspaceId`)) {
        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject[['defaultConnectorWorkspaceId']] <- self$`defaultConnectorWorkspaceId`$toJSON()
      }
      if (!is.null(self$`defaultConnectorSubscriptionKey`)) {
        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject[['defaultConnectorSubscriptionKey']] <- self$`defaultConnectorSubscriptionKey`$toJSON()
      }
      if (!is.null(self$`languageMapLocation`)) {
        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject[['languageMapLocation']] <- self$`languageMapLocation`$toJSON()
      }
      if (!is.null(self$`categoryMapLocation`)) {
        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject[['categoryMapLocation']] <- self$`categoryMapLocation`$toJSON()
      }
      if (!is.null(self$`retryAttempts`)) {
        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject[['retryAttempts']] <- self$`retryAttempts`$toJSON()
      }
      if (!is.null(self$`timeoutCount`)) {
        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject[['timeoutCount']] <- self$`timeoutCount`$toJSON()
      }

      ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject
    },
    fromJSON = function(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesJson) {
      ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesJson)
      if (!is.null(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$`translationFactory`)) {
        translationFactoryObject <- ConfigNodePropertyString$new()
        translationFactoryObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$translationFactory, auto_unbox = TRUE))
        self$`translationFactory` <- translationFactoryObject
      }
      if (!is.null(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$`defaultConnectorLabel`)) {
        defaultConnectorLabelObject <- ConfigNodePropertyString$new()
        defaultConnectorLabelObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$defaultConnectorLabel, auto_unbox = TRUE))
        self$`defaultConnectorLabel` <- defaultConnectorLabelObject
      }
      if (!is.null(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$`defaultConnectorAttribution`)) {
        defaultConnectorAttributionObject <- ConfigNodePropertyString$new()
        defaultConnectorAttributionObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$defaultConnectorAttribution, auto_unbox = TRUE))
        self$`defaultConnectorAttribution` <- defaultConnectorAttributionObject
      }
      if (!is.null(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$`defaultConnectorWorkspaceId`)) {
        defaultConnectorWorkspaceIdObject <- ConfigNodePropertyString$new()
        defaultConnectorWorkspaceIdObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$defaultConnectorWorkspaceId, auto_unbox = TRUE))
        self$`defaultConnectorWorkspaceId` <- defaultConnectorWorkspaceIdObject
      }
      if (!is.null(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$`defaultConnectorSubscriptionKey`)) {
        defaultConnectorSubscriptionKeyObject <- ConfigNodePropertyString$new()
        defaultConnectorSubscriptionKeyObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$defaultConnectorSubscriptionKey, auto_unbox = TRUE))
        self$`defaultConnectorSubscriptionKey` <- defaultConnectorSubscriptionKeyObject
      }
      if (!is.null(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$`languageMapLocation`)) {
        languageMapLocationObject <- ConfigNodePropertyString$new()
        languageMapLocationObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$languageMapLocation, auto_unbox = TRUE))
        self$`languageMapLocation` <- languageMapLocationObject
      }
      if (!is.null(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$`categoryMapLocation`)) {
        categoryMapLocationObject <- ConfigNodePropertyString$new()
        categoryMapLocationObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$categoryMapLocation, auto_unbox = TRUE))
        self$`categoryMapLocation` <- categoryMapLocationObject
      }
      if (!is.null(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$`retryAttempts`)) {
        retryAttemptsObject <- ConfigNodePropertyInteger$new()
        retryAttemptsObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$retryAttempts, auto_unbox = TRUE))
        self$`retryAttempts` <- retryAttemptsObject
      }
      if (!is.null(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$`timeoutCount`)) {
        timeoutCountObject <- ConfigNodePropertyInteger$new()
        timeoutCountObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$timeoutCount, auto_unbox = TRUE))
        self$`timeoutCount` <- timeoutCountObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "translationFactory": %s,
           "defaultConnectorLabel": %s,
           "defaultConnectorAttribution": %s,
           "defaultConnectorWorkspaceId": %s,
           "defaultConnectorSubscriptionKey": %s,
           "languageMapLocation": %s,
           "categoryMapLocation": %s,
           "retryAttempts": %s,
           "timeoutCount": %s
        }',
        self$`translationFactory`$toJSON(),
        self$`defaultConnectorLabel`$toJSON(),
        self$`defaultConnectorAttribution`$toJSON(),
        self$`defaultConnectorWorkspaceId`$toJSON(),
        self$`defaultConnectorSubscriptionKey`$toJSON(),
        self$`languageMapLocation`$toJSON(),
        self$`categoryMapLocation`$toJSON(),
        self$`retryAttempts`$toJSON(),
        self$`timeoutCount`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesJson) {
      ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`translationFactory` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$translationFactory, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`defaultConnectorLabel` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$defaultConnectorLabel, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`defaultConnectorAttribution` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$defaultConnectorAttribution, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`defaultConnectorWorkspaceId` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$defaultConnectorWorkspaceId, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`defaultConnectorSubscriptionKey` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$defaultConnectorSubscriptionKey, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`languageMapLocation` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$languageMapLocation, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`categoryMapLocation` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$categoryMapLocation, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`retryAttempts` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$retryAttempts, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`timeoutCount` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesObject$timeoutCount, auto_unbox = TRUE))
    }
  )
)