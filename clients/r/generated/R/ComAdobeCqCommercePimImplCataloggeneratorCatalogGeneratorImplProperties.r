# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties Class
#'
#' @field cq.commerce.cataloggenerator.bucketsize 
#' @field cq.commerce.cataloggenerator.bucketname 
#' @field cq.commerce.cataloggenerator.excludedtemplateproperties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties <- R6::R6Class(
  'ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties',
  public = list(
    `cq.commerce.cataloggenerator.bucketsize` = NULL,
    `cq.commerce.cataloggenerator.bucketname` = NULL,
    `cq.commerce.cataloggenerator.excludedtemplateproperties` = NULL,
    initialize = function(`cq.commerce.cataloggenerator.bucketsize`, `cq.commerce.cataloggenerator.bucketname`, `cq.commerce.cataloggenerator.excludedtemplateproperties`){
      if (!missing(`cq.commerce.cataloggenerator.bucketsize`)) {
        stopifnot(R6::is.R6(`cq.commerce.cataloggenerator.bucketsize`))
        self$`cq.commerce.cataloggenerator.bucketsize` <- `cq.commerce.cataloggenerator.bucketsize`
      }
      if (!missing(`cq.commerce.cataloggenerator.bucketname`)) {
        stopifnot(R6::is.R6(`cq.commerce.cataloggenerator.bucketname`))
        self$`cq.commerce.cataloggenerator.bucketname` <- `cq.commerce.cataloggenerator.bucketname`
      }
      if (!missing(`cq.commerce.cataloggenerator.excludedtemplateproperties`)) {
        stopifnot(R6::is.R6(`cq.commerce.cataloggenerator.excludedtemplateproperties`))
        self$`cq.commerce.cataloggenerator.excludedtemplateproperties` <- `cq.commerce.cataloggenerator.excludedtemplateproperties`
      }
    },
    toJSON = function() {
      ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject <- list()
      if (!is.null(self$`cq.commerce.cataloggenerator.bucketsize`)) {
        ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject[['cq.commerce.cataloggenerator.bucketsize']] <- self$`cq.commerce.cataloggenerator.bucketsize`$toJSON()
      }
      if (!is.null(self$`cq.commerce.cataloggenerator.bucketname`)) {
        ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject[['cq.commerce.cataloggenerator.bucketname']] <- self$`cq.commerce.cataloggenerator.bucketname`$toJSON()
      }
      if (!is.null(self$`cq.commerce.cataloggenerator.excludedtemplateproperties`)) {
        ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject[['cq.commerce.cataloggenerator.excludedtemplateproperties']] <- self$`cq.commerce.cataloggenerator.excludedtemplateproperties`$toJSON()
      }

      ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject
    },
    fromJSON = function(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesJson) {
      ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject <- jsonlite::fromJSON(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesJson)
      if (!is.null(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject$`cq.commerce.cataloggenerator.bucketsize`)) {
        cq.commerce.cataloggenerator.bucketsizeObject <- ConfigNodePropertyInteger$new()
        cq.commerce.cataloggenerator.bucketsizeObject$fromJSON(jsonlite::toJSON(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject$cq.commerce.cataloggenerator.bucketsize, auto_unbox = TRUE))
        self$`cq.commerce.cataloggenerator.bucketsize` <- cq.commerce.cataloggenerator.bucketsizeObject
      }
      if (!is.null(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject$`cq.commerce.cataloggenerator.bucketname`)) {
        cq.commerce.cataloggenerator.bucketnameObject <- ConfigNodePropertyString$new()
        cq.commerce.cataloggenerator.bucketnameObject$fromJSON(jsonlite::toJSON(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject$cq.commerce.cataloggenerator.bucketname, auto_unbox = TRUE))
        self$`cq.commerce.cataloggenerator.bucketname` <- cq.commerce.cataloggenerator.bucketnameObject
      }
      if (!is.null(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject$`cq.commerce.cataloggenerator.excludedtemplateproperties`)) {
        cq.commerce.cataloggenerator.excludedtemplatepropertiesObject <- ConfigNodePropertyArray$new()
        cq.commerce.cataloggenerator.excludedtemplatepropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject$cq.commerce.cataloggenerator.excludedtemplateproperties, auto_unbox = TRUE))
        self$`cq.commerce.cataloggenerator.excludedtemplateproperties` <- cq.commerce.cataloggenerator.excludedtemplatepropertiesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "cq.commerce.cataloggenerator.bucketsize": %s,
           "cq.commerce.cataloggenerator.bucketname": %s,
           "cq.commerce.cataloggenerator.excludedtemplateproperties": %s
        }',
        self$`cq.commerce.cataloggenerator.bucketsize`$toJSON(),
        self$`cq.commerce.cataloggenerator.bucketname`$toJSON(),
        self$`cq.commerce.cataloggenerator.excludedtemplateproperties`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesJson) {
      ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject <- jsonlite::fromJSON(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesJson)
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`cq.commerce.cataloggenerator.bucketsize` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject$cq.commerce.cataloggenerator.bucketsize, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`cq.commerce.cataloggenerator.bucketname` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject$cq.commerce.cataloggenerator.bucketname, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`cq.commerce.cataloggenerator.excludedtemplateproperties` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesObject$cq.commerce.cataloggenerator.excludedtemplateproperties, auto_unbox = TRUE))
    }
  )
)