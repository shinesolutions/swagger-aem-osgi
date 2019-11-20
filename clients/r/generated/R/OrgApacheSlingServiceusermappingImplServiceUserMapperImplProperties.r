# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties Class
#'
#' @field user.mapping 
#' @field user.default 
#' @field user.enable.default.mapping 
#' @field require.validation 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties <- R6::R6Class(
  'OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties',
  public = list(
    `user.mapping` = NULL,
    `user.default` = NULL,
    `user.enable.default.mapping` = NULL,
    `require.validation` = NULL,
    initialize = function(`user.mapping`, `user.default`, `user.enable.default.mapping`, `require.validation`){
      if (!missing(`user.mapping`)) {
        stopifnot(R6::is.R6(`user.mapping`))
        self$`user.mapping` <- `user.mapping`
      }
      if (!missing(`user.default`)) {
        stopifnot(R6::is.R6(`user.default`))
        self$`user.default` <- `user.default`
      }
      if (!missing(`user.enable.default.mapping`)) {
        stopifnot(R6::is.R6(`user.enable.default.mapping`))
        self$`user.enable.default.mapping` <- `user.enable.default.mapping`
      }
      if (!missing(`require.validation`)) {
        stopifnot(R6::is.R6(`require.validation`))
        self$`require.validation` <- `require.validation`
      }
    },
    toJSON = function() {
      OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject <- list()
      if (!is.null(self$`user.mapping`)) {
        OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject[['user.mapping']] <- self$`user.mapping`$toJSON()
      }
      if (!is.null(self$`user.default`)) {
        OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject[['user.default']] <- self$`user.default`$toJSON()
      }
      if (!is.null(self$`user.enable.default.mapping`)) {
        OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject[['user.enable.default.mapping']] <- self$`user.enable.default.mapping`$toJSON()
      }
      if (!is.null(self$`require.validation`)) {
        OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject[['require.validation']] <- self$`require.validation`$toJSON()
      }

      OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject
    },
    fromJSON = function(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesJson) {
      OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesJson)
      if (!is.null(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$`user.mapping`)) {
        user.mappingObject <- ConfigNodePropertyArray$new()
        user.mappingObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$user.mapping, auto_unbox = TRUE))
        self$`user.mapping` <- user.mappingObject
      }
      if (!is.null(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$`user.default`)) {
        user.defaultObject <- ConfigNodePropertyString$new()
        user.defaultObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$user.default, auto_unbox = TRUE))
        self$`user.default` <- user.defaultObject
      }
      if (!is.null(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$`user.enable.default.mapping`)) {
        user.enable.default.mappingObject <- ConfigNodePropertyBoolean$new()
        user.enable.default.mappingObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$user.enable.default.mapping, auto_unbox = TRUE))
        self$`user.enable.default.mapping` <- user.enable.default.mappingObject
      }
      if (!is.null(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$`require.validation`)) {
        require.validationObject <- ConfigNodePropertyBoolean$new()
        require.validationObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$require.validation, auto_unbox = TRUE))
        self$`require.validation` <- require.validationObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "user.mapping": %s,
           "user.default": %s,
           "user.enable.default.mapping": %s,
           "require.validation": %s
        }',
        self$`user.mapping`$toJSON(),
        self$`user.default`$toJSON(),
        self$`user.enable.default.mapping`$toJSON(),
        self$`require.validation`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesJson) {
      OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`user.mapping` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$user.mapping, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`user.default` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$user.default, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`user.enable.default.mapping` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$user.enable.default.mapping, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`require.validation` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesObject$require.validation, auto_unbox = TRUE))
    }
  )
)