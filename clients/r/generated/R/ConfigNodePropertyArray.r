# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ConfigNodePropertyArray Class
#'
#' @field name 
#' @field optional 
#' @field is_set 
#' @field type 
#' @field values 
#' @field description 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConfigNodePropertyArray <- R6::R6Class(
  'ConfigNodePropertyArray',
  public = list(
    `name` = NULL,
    `optional` = NULL,
    `is_set` = NULL,
    `type` = NULL,
    `values` = NULL,
    `description` = NULL,
    initialize = function(`name`, `optional`, `is_set`, `type`, `values`, `description`){
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`optional`)) {
        self$`optional` <- `optional`
      }
      if (!missing(`is_set`)) {
        self$`is_set` <- `is_set`
      }
      if (!missing(`type`)) {
        stopifnot(is.numeric(`type`), length(`type`) == 1)
        self$`type` <- `type`
      }
      if (!missing(`values`)) {
        stopifnot(is.list(`values`), length(`values`) != 0)
        lapply(`values`, function(x) stopifnot(is.character(x)))
        self$`values` <- `values`
      }
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
    },
    toJSON = function() {
      ConfigNodePropertyArrayObject <- list()
      if (!is.null(self$`name`)) {
        ConfigNodePropertyArrayObject[['name']] <- self$`name`
      }
      if (!is.null(self$`optional`)) {
        ConfigNodePropertyArrayObject[['optional']] <- self$`optional`
      }
      if (!is.null(self$`is_set`)) {
        ConfigNodePropertyArrayObject[['is_set']] <- self$`is_set`
      }
      if (!is.null(self$`type`)) {
        ConfigNodePropertyArrayObject[['type']] <- self$`type`
      }
      if (!is.null(self$`values`)) {
        ConfigNodePropertyArrayObject[['values']] <- self$`values`
      }
      if (!is.null(self$`description`)) {
        ConfigNodePropertyArrayObject[['description']] <- self$`description`
      }

      ConfigNodePropertyArrayObject
    },
    fromJSON = function(ConfigNodePropertyArrayJson) {
      ConfigNodePropertyArrayObject <- jsonlite::fromJSON(ConfigNodePropertyArrayJson)
      if (!is.null(ConfigNodePropertyArrayObject$`name`)) {
        self$`name` <- ConfigNodePropertyArrayObject$`name`
      }
      if (!is.null(ConfigNodePropertyArrayObject$`optional`)) {
        self$`optional` <- ConfigNodePropertyArrayObject$`optional`
      }
      if (!is.null(ConfigNodePropertyArrayObject$`is_set`)) {
        self$`is_set` <- ConfigNodePropertyArrayObject$`is_set`
      }
      if (!is.null(ConfigNodePropertyArrayObject$`type`)) {
        self$`type` <- ConfigNodePropertyArrayObject$`type`
      }
      if (!is.null(ConfigNodePropertyArrayObject$`values`)) {
        self$`values` <- ConfigNodePropertyArrayObject$`values`
      }
      if (!is.null(ConfigNodePropertyArrayObject$`description`)) {
        self$`description` <- ConfigNodePropertyArrayObject$`description`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "name": %s,
           "optional": %s,
           "is_set": %s,
           "type": %d,
           "values": [%s],
           "description": %s
        }',
        self$`name`,
        self$`optional`,
        self$`is_set`,
        self$`type`,
        lapply(self$`values`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`description`
      )
    },
    fromJSONString = function(ConfigNodePropertyArrayJson) {
      ConfigNodePropertyArrayObject <- jsonlite::fromJSON(ConfigNodePropertyArrayJson)
      self$`name` <- ConfigNodePropertyArrayObject$`name`
      self$`optional` <- ConfigNodePropertyArrayObject$`optional`
      self$`is_set` <- ConfigNodePropertyArrayObject$`is_set`
      self$`type` <- ConfigNodePropertyArrayObject$`type`
      self$`values` <- ConfigNodePropertyArrayObject$`values`
      self$`description` <- ConfigNodePropertyArrayObject$`description`
    }
  )
)