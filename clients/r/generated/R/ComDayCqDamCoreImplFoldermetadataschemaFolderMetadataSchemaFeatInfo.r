# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo <- R6::R6Class(
  'ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo',
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
      ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject
    },
    fromJSON = function(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoJson) {
      ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject <- jsonlite::fromJSON(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoJson)
      if (!is.null(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`pid`)) {
        self$`pid` <- ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`pid`
      }
      if (!is.null(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`title`)) {
        self$`title` <- ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`title`
      }
      if (!is.null(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`description`)) {
        self$`description` <- ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`description`
      }
      if (!is.null(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`properties`)) {
        propertiesObject <- ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoJson) {
      ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject <- jsonlite::fromJSON(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoJson)
      self$`pid` <- ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`pid`
      self$`title` <- ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`title`
      self$`description` <- ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$`description`
      ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesObject <- ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties$new()
      self$`properties` <- ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesObject$fromJSON(jsonlite::toJSON(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoObject$properties, auto_unbox = TRUE))
    }
  )
)