# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties Class
#'
#' @field service.ranking 
#' @field tagpattern 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties <- R6::R6Class(
  'ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties',
  public = list(
    `service.ranking` = NULL,
    `tagpattern` = NULL,
    initialize = function(`service.ranking`, `tagpattern`){
      if (!missing(`service.ranking`)) {
        stopifnot(R6::is.R6(`service.ranking`))
        self$`service.ranking` <- `service.ranking`
      }
      if (!missing(`tagpattern`)) {
        stopifnot(R6::is.R6(`tagpattern`))
        self$`tagpattern` <- `tagpattern`
      }
    },
    toJSON = function() {
      ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject <- list()
      if (!is.null(self$`service.ranking`)) {
        ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject[['service.ranking']] <- self$`service.ranking`$toJSON()
      }
      if (!is.null(self$`tagpattern`)) {
        ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject[['tagpattern']] <- self$`tagpattern`$toJSON()
      }

      ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject
    },
    fromJSON = function(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesJson) {
      ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject <- jsonlite::fromJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesJson)
      if (!is.null(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject$`service.ranking`)) {
        service.rankingObject <- ConfigNodePropertyInteger$new()
        service.rankingObject$fromJSON(jsonlite::toJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject$service.ranking, auto_unbox = TRUE))
        self$`service.ranking` <- service.rankingObject
      }
      if (!is.null(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject$`tagpattern`)) {
        tagpatternObject <- ConfigNodePropertyString$new()
        tagpatternObject$fromJSON(jsonlite::toJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject$tagpattern, auto_unbox = TRUE))
        self$`tagpattern` <- tagpatternObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "service.ranking": %s,
           "tagpattern": %s
        }',
        self$`service.ranking`$toJSON(),
        self$`tagpattern`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesJson) {
      ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject <- jsonlite::fromJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesJson)
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`service.ranking` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject$service.ranking, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`tagpattern` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesObject$tagpattern, auto_unbox = TRUE))
    }
  )
)