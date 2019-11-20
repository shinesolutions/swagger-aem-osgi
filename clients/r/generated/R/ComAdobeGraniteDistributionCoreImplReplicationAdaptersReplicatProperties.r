# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties Class
#'
#' @field providerName 
#' @field forward.requests 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties <- R6::R6Class(
  'ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties',
  public = list(
    `providerName` = NULL,
    `forward.requests` = NULL,
    initialize = function(`providerName`, `forward.requests`){
      if (!missing(`providerName`)) {
        stopifnot(R6::is.R6(`providerName`))
        self$`providerName` <- `providerName`
      }
      if (!missing(`forward.requests`)) {
        stopifnot(R6::is.R6(`forward.requests`))
        self$`forward.requests` <- `forward.requests`
      }
    },
    toJSON = function() {
      ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject <- list()
      if (!is.null(self$`providerName`)) {
        ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject[['providerName']] <- self$`providerName`$toJSON()
      }
      if (!is.null(self$`forward.requests`)) {
        ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject[['forward.requests']] <- self$`forward.requests`$toJSON()
      }

      ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject
    },
    fromJSON = function(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesJson) {
      ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesJson)
      if (!is.null(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject$`providerName`)) {
        providerNameObject <- ConfigNodePropertyString$new()
        providerNameObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject$providerName, auto_unbox = TRUE))
        self$`providerName` <- providerNameObject
      }
      if (!is.null(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject$`forward.requests`)) {
        forward.requestsObject <- ConfigNodePropertyBoolean$new()
        forward.requestsObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject$forward.requests, auto_unbox = TRUE))
        self$`forward.requests` <- forward.requestsObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "providerName": %s,
           "forward.requests": %s
        }',
        self$`providerName`$toJSON(),
        self$`forward.requests`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesJson) {
      ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`providerName` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject$providerName, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`forward.requests` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesObject$forward.requests, auto_unbox = TRUE))
    }
  )
)