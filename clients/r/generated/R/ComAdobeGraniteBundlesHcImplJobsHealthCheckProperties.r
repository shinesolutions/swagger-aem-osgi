# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties Class
#'
#' @field hc.tags 
#' @field max.queued.jobs 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties <- R6::R6Class(
  'ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties',
  public = list(
    `hc.tags` = NULL,
    `max.queued.jobs` = NULL,
    initialize = function(`hc.tags`, `max.queued.jobs`){
      if (!missing(`hc.tags`)) {
        stopifnot(R6::is.R6(`hc.tags`))
        self$`hc.tags` <- `hc.tags`
      }
      if (!missing(`max.queued.jobs`)) {
        stopifnot(R6::is.R6(`max.queued.jobs`))
        self$`max.queued.jobs` <- `max.queued.jobs`
      }
    },
    toJSON = function() {
      ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject <- list()
      if (!is.null(self$`hc.tags`)) {
        ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject[['hc.tags']] <- self$`hc.tags`$toJSON()
      }
      if (!is.null(self$`max.queued.jobs`)) {
        ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject[['max.queued.jobs']] <- self$`max.queued.jobs`$toJSON()
      }

      ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject
    },
    fromJSON = function(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesJson) {
      ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesJson)
      if (!is.null(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject$`hc.tags`)) {
        hc.tagsObject <- ConfigNodePropertyArray$new()
        hc.tagsObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject$hc.tags, auto_unbox = TRUE))
        self$`hc.tags` <- hc.tagsObject
      }
      if (!is.null(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject$`max.queued.jobs`)) {
        max.queued.jobsObject <- ConfigNodePropertyInteger$new()
        max.queued.jobsObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject$max.queued.jobs, auto_unbox = TRUE))
        self$`max.queued.jobs` <- max.queued.jobsObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "hc.tags": %s,
           "max.queued.jobs": %s
        }',
        self$`hc.tags`$toJSON(),
        self$`max.queued.jobs`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesJson) {
      ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject <- jsonlite::fromJSON(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesJson)
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`hc.tags` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject$hc.tags, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`max.queued.jobs` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesObject$max.queued.jobs, auto_unbox = TRUE))
    }
  )
)