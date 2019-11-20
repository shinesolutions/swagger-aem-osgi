# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties Class
#'
#' @field enable 
#' @field UGCLimit 
#' @field ugcLimitDuration 
#' @field domains 
#' @field toList 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties <- R6::R6Class(
  'ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties',
  public = list(
    `enable` = NULL,
    `UGCLimit` = NULL,
    `ugcLimitDuration` = NULL,
    `domains` = NULL,
    `toList` = NULL,
    initialize = function(`enable`, `UGCLimit`, `ugcLimitDuration`, `domains`, `toList`){
      if (!missing(`enable`)) {
        stopifnot(R6::is.R6(`enable`))
        self$`enable` <- `enable`
      }
      if (!missing(`UGCLimit`)) {
        stopifnot(R6::is.R6(`UGCLimit`))
        self$`UGCLimit` <- `UGCLimit`
      }
      if (!missing(`ugcLimitDuration`)) {
        stopifnot(R6::is.R6(`ugcLimitDuration`))
        self$`ugcLimitDuration` <- `ugcLimitDuration`
      }
      if (!missing(`domains`)) {
        stopifnot(R6::is.R6(`domains`))
        self$`domains` <- `domains`
      }
      if (!missing(`toList`)) {
        stopifnot(R6::is.R6(`toList`))
        self$`toList` <- `toList`
      }
    },
    toJSON = function() {
      ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject <- list()
      if (!is.null(self$`enable`)) {
        ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject[['enable']] <- self$`enable`$toJSON()
      }
      if (!is.null(self$`UGCLimit`)) {
        ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject[['UGCLimit']] <- self$`UGCLimit`$toJSON()
      }
      if (!is.null(self$`ugcLimitDuration`)) {
        ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject[['ugcLimitDuration']] <- self$`ugcLimitDuration`$toJSON()
      }
      if (!is.null(self$`domains`)) {
        ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject[['domains']] <- self$`domains`$toJSON()
      }
      if (!is.null(self$`toList`)) {
        ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject[['toList']] <- self$`toList`$toJSON()
      }

      ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject
    },
    fromJSON = function(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesJson) {
      ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesJson)
      if (!is.null(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$`enable`)) {
        enableObject <- ConfigNodePropertyBoolean$new()
        enableObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$enable, auto_unbox = TRUE))
        self$`enable` <- enableObject
      }
      if (!is.null(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$`UGCLimit`)) {
        UGCLimitObject <- ConfigNodePropertyInteger$new()
        UGCLimitObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$UGCLimit, auto_unbox = TRUE))
        self$`UGCLimit` <- UGCLimitObject
      }
      if (!is.null(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$`ugcLimitDuration`)) {
        ugcLimitDurationObject <- ConfigNodePropertyInteger$new()
        ugcLimitDurationObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$ugcLimitDuration, auto_unbox = TRUE))
        self$`ugcLimitDuration` <- ugcLimitDurationObject
      }
      if (!is.null(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$`domains`)) {
        domainsObject <- ConfigNodePropertyArray$new()
        domainsObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$domains, auto_unbox = TRUE))
        self$`domains` <- domainsObject
      }
      if (!is.null(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$`toList`)) {
        toListObject <- ConfigNodePropertyArray$new()
        toListObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$toList, auto_unbox = TRUE))
        self$`toList` <- toListObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "enable": %s,
           "UGCLimit": %s,
           "ugcLimitDuration": %s,
           "domains": %s,
           "toList": %s
        }',
        self$`enable`$toJSON(),
        self$`UGCLimit`$toJSON(),
        self$`ugcLimitDuration`$toJSON(),
        self$`domains`$toJSON(),
        self$`toList`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesJson) {
      ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject <- jsonlite::fromJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesJson)
      ConfigNodePropertyBooleanObject <- ConfigNodePropertyBoolean$new()
      self$`enable` <- ConfigNodePropertyBooleanObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$enable, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`UGCLimit` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$UGCLimit, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`ugcLimitDuration` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$ugcLimitDuration, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`domains` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$domains, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`toList` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesObject$toList, auto_unbox = TRUE))
    }
  )
)