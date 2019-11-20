# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo <- R6::R6Class(
  'ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo',
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
      ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject <- list()
      if (!is.null(self$`pid`)) {
        ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`properties`)) {
        ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject
    },
    fromJSON = function(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoJson) {
      ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject <- jsonlite::fromJSON(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoJson)
      if (!is.null(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`pid`)) {
        self$`pid` <- ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`pid`
      }
      if (!is.null(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`title`)) {
        self$`title` <- ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`title`
      }
      if (!is.null(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`description`)) {
        self$`description` <- ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`description`
      }
      if (!is.null(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`properties`)) {
        propertiesObject <- ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$properties, auto_unbox = TRUE))
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
    fromJSONString = function(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoJson) {
      ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject <- jsonlite::fromJSON(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoJson)
      self$`pid` <- ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`pid`
      self$`title` <- ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`title`
      self$`description` <- ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$`description`
      ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesObject <- ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties$new()
      self$`properties` <- ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesObject$fromJSON(jsonlite::toJSON(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoObject$properties, auto_unbox = TRUE))
    }
  )
)