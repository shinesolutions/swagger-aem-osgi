# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo <- R6::R6Class(
  'ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo',
  public = list(
    `pid` = NULL,
    `title` = NULL,
    `description` = NULL,
    `properties` = NULL,
    initialize = function(`pid`, `title`, `description`, `properties`){
      if (!missing(`pid`)) {
        stopifnot(is.character(`pid`), length(`pid`) == 1)
        self$`pid` <- `pid`
      }
      if (!missing(`title`)) {
        stopifnot(is.character(`title`), length(`title`) == 1)
        self$`title` <- `title`
      }
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`properties`)) {
        stopifnot(R6::is.R6(`properties`))
        self$`properties` <- `properties`
      }
    },
    toJSON = function() {
      ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject
    },
    fromJSON = function(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoJson) {
      ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject <- jsonlite::fromJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoJson)
      if (!is.null(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`pid`)) {
        self$`pid` <- ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`pid`
      }
      if (!is.null(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`title`)) {
        self$`title` <- ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`title`
      }
      if (!is.null(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`description`)) {
        self$`description` <- ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`description`
      }
      if (!is.null(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`properties`)) {
        propertiesObject <- ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$properties, auto_unbox = TRUE))
        self$`properties` <- propertiesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "pid": %s,
           "title": %s,
           "description": %s,
           "properties": %s
        }',
        self$`pid`,
        self$`title`,
        self$`description`,
        self$`properties`$toJSON()
      )
    },
    fromJSONString = function(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoJson) {
      ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject <- jsonlite::fromJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoJson)
      self$`pid` <- ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`pid`
      self$`title` <- ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`title`
      self$`description` <- ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$`description`
      ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesObject <- ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties$new()
      self$`properties` <- ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoObject$properties, auto_unbox = TRUE))
    }
  )
)