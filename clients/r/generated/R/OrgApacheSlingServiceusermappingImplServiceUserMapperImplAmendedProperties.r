# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties Class
#'
#' @field service.ranking 
#' @field user.mapping 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties <- R6::R6Class(
  'OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties',
  public = list(
    `service.ranking` = NULL,
    `user.mapping` = NULL,
    initialize = function(`service.ranking`, `user.mapping`){
      if (!missing(`service.ranking`)) {
        stopifnot(R6::is.R6(`service.ranking`))
        self$`service.ranking` <- `service.ranking`
      }
      if (!missing(`user.mapping`)) {
        stopifnot(R6::is.R6(`user.mapping`))
        self$`user.mapping` <- `user.mapping`
      }
    },
    toJSON = function() {
      OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject <- list()
      if (!is.null(self$`service.ranking`)) {
        OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject[['service.ranking']] <- self$`service.ranking`$toJSON()
      }
      if (!is.null(self$`user.mapping`)) {
        OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject[['user.mapping']] <- self$`user.mapping`$toJSON()
      }

      OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject
    },
    fromJSON = function(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesJson) {
      OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesJson)
      if (!is.null(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject$`service.ranking`)) {
        service.rankingObject <- ConfigNodePropertyInteger$new()
        service.rankingObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject$service.ranking, auto_unbox = TRUE))
        self$`service.ranking` <- service.rankingObject
      }
      if (!is.null(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject$`user.mapping`)) {
        user.mappingObject <- ConfigNodePropertyArray$new()
        user.mappingObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject$user.mapping, auto_unbox = TRUE))
        self$`user.mapping` <- user.mappingObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "service.ranking": %s,
           "user.mapping": %s
        }',
        self$`service.ranking`$toJSON(),
        self$`user.mapping`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesJson) {
      OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject <- jsonlite::fromJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesJson)
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`service.ranking` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject$service.ranking, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`user.mapping` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesObject$user.mapping, auto_unbox = TRUE))
    }
  )
)