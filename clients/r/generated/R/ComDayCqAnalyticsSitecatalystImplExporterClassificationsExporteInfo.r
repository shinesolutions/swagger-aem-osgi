# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo <- R6::R6Class(
  'ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo',
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
      ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject
    },
    fromJSON = function(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoJson) {
      ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject <- jsonlite::fromJSON(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoJson)
      if (!is.null(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`pid`)) {
        self$`pid` <- ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`pid`
      }
      if (!is.null(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`title`)) {
        self$`title` <- ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`title`
      }
      if (!is.null(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`description`)) {
        self$`description` <- ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`description`
      }
      if (!is.null(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`properties`)) {
        propertiesObject <- ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoJson) {
      ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject <- jsonlite::fromJSON(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoJson)
      self$`pid` <- ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`pid`
      self$`title` <- ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`title`
      self$`description` <- ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$`description`
      ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesObject <- ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties$new()
      self$`properties` <- ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoObject$properties, auto_unbox = TRUE))
    }
  )
)