# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties Class
#'
#' @field version.id 
#' @field cache.on 
#' @field concurrency.level 
#' @field cache.start.size 
#' @field cache.ttl 
#' @field cache.size 
#' @field time.limit 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties <- R6::R6Class(
  'ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties',
  public = list(
    `version.id` = NULL,
    `cache.on` = NULL,
    `concurrency.level` = NULL,
    `cache.start.size` = NULL,
    `cache.ttl` = NULL,
    `cache.size` = NULL,
    `time.limit` = NULL,
    initialize = function(`version.id`, `cache.on`, `concurrency.level`, `cache.start.size`, `cache.ttl`, `cache.size`, `time.limit`){
      if (!missing(`version.id`)) {
        stopifnot(R6::is.R6(`version.id`))
        self$`version.id` <- `version.id`
      }
      if (!missing(`cache.on`)) {
        stopifnot(R6::is.R6(`cache.on`))
        self$`cache.on` <- `cache.on`
      }
      if (!missing(`concurrency.level`)) {
        stopifnot(R6::is.R6(`concurrency.level`))
        self$`concurrency.level` <- `concurrency.level`
      }
      if (!missing(`cache.start.size`)) {
        stopifnot(R6::is.R6(`cache.start.size`))
        self$`cache.start.size` <- `cache.start.size`
      }
      if (!missing(`cache.ttl`)) {
        stopifnot(R6::is.R6(`cache.ttl`))
        self$`cache.ttl` <- `cache.ttl`
      }
      if (!missing(`cache.size`)) {
        stopifnot(R6::is.R6(`cache.size`))
        self$`cache.size` <- `cache.size`
      }
      if (!missing(`time.limit`)) {
        stopifnot(R6::is.R6(`time.limit`))
        self$`time.limit` <- `time.limit`
      }
    },
    toJSON = function() {
      ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject <- list()
      if (!is.null(self$`version.id`)) {
        ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject[['version.id']] <- self$`version.id`$toJSON()
      }
      if (!is.null(self$`cache.on`)) {
        ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject[['cache.on']] <- self$`cache.on`$toJSON()
      }
      if (!is.null(self$`concurrency.level`)) {
        ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject[['concurrency.level']] <- self$`concurrency.level`$toJSON()
      }
      if (!is.null(self$`cache.start.size`)) {
        ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject[['cache.start.size']] <- self$`cache.start.size`$toJSON()
      }
      if (!is.null(self$`cache.ttl`)) {
        ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject[['cache.ttl']] <- self$`cache.ttl`$toJSON()
      }
      if (!is.null(self$`cache.size`)) {
        ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject[['cache.size']] <- self$`cache.size`$toJSON()
      }
      if (!is.null(self$`time.limit`)) {
        ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject[['time.limit']] <- self$`time.limit`$toJSON()
      }

      ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject
    },
    fromJSON = function(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesJson) {
      ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesJson)
      if (!is.null(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$`version.id`)) {
        version.idObject <- ConfigNodePropertyString$new()
        version.idObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$version.id, auto_unbox = TRUE))
        self$`version.id` <- version.idObject
      }
      if (!is.null(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$`cache.on`)) {
        cache.onObject <- ConfigNodePropertyBoolean$new()
        cache.onObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$cache.on, auto_unbox = TRUE))
        self$`cache.on` <- cache.onObject
      }
      if (!is.null(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$`concurrency.level`)) {
        concurrency.levelObject <- ConfigNodePropertyInteger$new()
        concurrency.levelObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$concurrency.level, auto_unbox = TRUE))
        self$`concurrency.level` <- concurrency.levelObject
      }
      if (!is.null(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$`cache.start.size`)) {
        cache.start.sizeObject <- ConfigNodePropertyInteger$new()
        cache.start.sizeObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$cache.start.size, auto_unbox = TRUE))
        self$`cache.start.size` <- cache.start.sizeObject
      }
      if (!is.null(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$`cache.ttl`)) {
        cache.ttlObject <- ConfigNodePropertyInteger$new()
        cache.ttlObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$cache.ttl, auto_unbox = TRUE))
        self$`cache.ttl` <- cache.ttlObject
      }
      if (!is.null(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$`cache.size`)) {
        cache.sizeObject <- ConfigNodePropertyInteger$new()
        cache.sizeObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$cache.size, auto_unbox = TRUE))
        self$`cache.size` <- cache.sizeObject
      }
      if (!is.null(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$`time.limit`)) {
        time.limitObject <- ConfigNodePropertyInteger$new()
        time.limitObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$time.limit, auto_unbox = TRUE))
        self$`time.limit` <- time.limitObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "version.id": %s,
           "cache.on": %s,
           "concurrency.level": %s,
           "cache.start.size": %s,
           "cache.ttl": %s,
           "cache.size": %s,
           "time.limit": %s
        }',
        self$`version.id`$toJSON(),
        self$`cache.on`$toJSON(),
        self$`concurrency.level`$toJSON(),
        self$`cache.start.size`$toJSON(),
        self$`cache.ttl`$toJSON(),
        self$`cache.size`$toJSON(),
        self$`time.limit`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesJson) {
      ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`version.id` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$version.id, auto_unbox = TRUE))
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`cache.on` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$cache.on, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`concurrency.level` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$concurrency.level, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`cache.start.size` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$cache.start.size, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`cache.ttl` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$cache.ttl, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`cache.size` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$cache.size, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`time.limit` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesObject$time.limit, auto_unbox = TRUE))
    }
  )
)