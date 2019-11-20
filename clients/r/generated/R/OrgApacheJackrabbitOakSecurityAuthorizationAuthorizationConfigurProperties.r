# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties Class
#'
#' @field permissionsJr2 
#' @field importBehavior 
#' @field readPaths 
#' @field administrativePrincipals 
#' @field configurationRanking 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties <- R6::R6Class(
  'OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties',
  public = list(
    `permissionsJr2` = NULL,
    `importBehavior` = NULL,
    `readPaths` = NULL,
    `administrativePrincipals` = NULL,
    `configurationRanking` = NULL,
    initialize = function(`permissionsJr2`, `importBehavior`, `readPaths`, `administrativePrincipals`, `configurationRanking`){
      if (!missing(`permissionsJr2`)) {
        stopifnot(R6::is.R6(`permissionsJr2`))
        self$`permissionsJr2` <- `permissionsJr2`
      }
      if (!missing(`importBehavior`)) {
        stopifnot(R6::is.R6(`importBehavior`))
        self$`importBehavior` <- `importBehavior`
      }
      if (!missing(`readPaths`)) {
        stopifnot(R6::is.R6(`readPaths`))
        self$`readPaths` <- `readPaths`
      }
      if (!missing(`administrativePrincipals`)) {
        stopifnot(R6::is.R6(`administrativePrincipals`))
        self$`administrativePrincipals` <- `administrativePrincipals`
      }
      if (!missing(`configurationRanking`)) {
        stopifnot(R6::is.R6(`configurationRanking`))
        self$`configurationRanking` <- `configurationRanking`
      }
    },
    toJSON = function() {
      OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject <- list()
      if (!is.null(self$`permissionsJr2`)) {
        OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject[['permissionsJr2']] <- self$`permissionsJr2`$toJSON()
      }
      if (!is.null(self$`importBehavior`)) {
        OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject[['importBehavior']] <- self$`importBehavior`$toJSON()
      }
      if (!is.null(self$`readPaths`)) {
        OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject[['readPaths']] <- self$`readPaths`$toJSON()
      }
      if (!is.null(self$`administrativePrincipals`)) {
        OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject[['administrativePrincipals']] <- self$`administrativePrincipals`$toJSON()
      }
      if (!is.null(self$`configurationRanking`)) {
        OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject[['configurationRanking']] <- self$`configurationRanking`$toJSON()
      }

      OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject
    },
    fromJSON = function(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesJson) {
      OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject <- jsonlite::fromJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesJson)
      if (!is.null(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$`permissionsJr2`)) {
        permissionsJr2Object <- ConfigNodePropertyDropDown$new()
        permissionsJr2Object$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$permissionsJr2, auto_unbox = TRUE))
        self$`permissionsJr2` <- permissionsJr2Object
      }
      if (!is.null(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$`importBehavior`)) {
        importBehaviorObject <- ConfigNodePropertyDropDown$new()
        importBehaviorObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$importBehavior, auto_unbox = TRUE))
        self$`importBehavior` <- importBehaviorObject
      }
      if (!is.null(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$`readPaths`)) {
        readPathsObject <- ConfigNodePropertyArray$new()
        readPathsObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$readPaths, auto_unbox = TRUE))
        self$`readPaths` <- readPathsObject
      }
      if (!is.null(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$`administrativePrincipals`)) {
        administrativePrincipalsObject <- ConfigNodePropertyArray$new()
        administrativePrincipalsObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$administrativePrincipals, auto_unbox = TRUE))
        self$`administrativePrincipals` <- administrativePrincipalsObject
      }
      if (!is.null(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$`configurationRanking`)) {
        configurationRankingObject <- ConfigNodePropertyInteger$new()
        configurationRankingObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$configurationRanking, auto_unbox = TRUE))
        self$`configurationRanking` <- configurationRankingObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "permissionsJr2": %s,
           "importBehavior": %s,
           "readPaths": %s,
           "administrativePrincipals": %s,
           "configurationRanking": %s
        }',
        self$`permissionsJr2`$toJSON(),
        self$`importBehavior`$toJSON(),
        self$`readPaths`$toJSON(),
        self$`administrativePrincipals`$toJSON(),
        self$`configurationRanking`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesJson) {
      OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject <- jsonlite::fromJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesJson)
      ConfigNodePropertyDropDownObject <- ConfigNodePropertyDropDown$new()
      self$`permissionsJr2` <- ConfigNodePropertyDropDownObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$permissionsJr2, auto_unbox = TRUE))
      ConfigNodePropertyDropDownObject <- ConfigNodePropertyDropDown$new()
      self$`importBehavior` <- ConfigNodePropertyDropDownObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$importBehavior, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`readPaths` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$readPaths, auto_unbox = TRUE))
      ConfigNodePropertyArrayObject <- ConfigNodePropertyArray$new()
      self$`administrativePrincipals` <- ConfigNodePropertyArrayObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$administrativePrincipals, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`configurationRanking` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesObject$configurationRanking, auto_unbox = TRUE))
    }
  )
)