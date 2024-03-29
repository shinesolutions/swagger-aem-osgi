# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties Class
#'
#' @field manager.root 
#' @field http.service.filter 
#' @field default.render 
#' @field realm 
#' @field username 
#' @field password 
#' @field category 
#' @field locale 
#' @field loglevel 
#' @field plugins 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties <- R6::R6Class(
  'OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties',
  public = list(
    `manager.root` = NULL,
    `http.service.filter` = NULL,
    `default.render` = NULL,
    `realm` = NULL,
    `username` = NULL,
    `password` = NULL,
    `category` = NULL,
    `locale` = NULL,
    `loglevel` = NULL,
    `plugins` = NULL,
    initialize = function(`manager.root`, `http.service.filter`, `default.render`, `realm`, `username`, `password`, `category`, `locale`, `loglevel`, `plugins`){
      if (!missing(`manager.root`)) {
        stopifnot(R6::is.R6(`manager.root`))
        self$`manager.root` <- `manager.root`
      }
      if (!missing(`http.service.filter`)) {
        stopifnot(R6::is.R6(`http.service.filter`))
        self$`http.service.filter` <- `http.service.filter`
      }
      if (!missing(`default.render`)) {
        stopifnot(R6::is.R6(`default.render`))
        self$`default.render` <- `default.render`
      }
      if (!missing(`realm`)) {
        stopifnot(R6::is.R6(`realm`))
        self$`realm` <- `realm`
      }
      if (!missing(`username`)) {
        stopifnot(R6::is.R6(`username`))
        self$`username` <- `username`
      }
      if (!missing(`password`)) {
        stopifnot(R6::is.R6(`password`))
        self$`password` <- `password`
      }
      if (!missing(`category`)) {
        stopifnot(R6::is.R6(`category`))
        self$`category` <- `category`
      }
      if (!missing(`locale`)) {
        stopifnot(R6::is.R6(`locale`))
        self$`locale` <- `locale`
      }
      if (!missing(`loglevel`)) {
        stopifnot(R6::is.R6(`loglevel`))
        self$`loglevel` <- `loglevel`
      }
      if (!missing(`plugins`)) {
        stopifnot(R6::is.R6(`plugins`))
        self$`plugins` <- `plugins`
      }
    },
    toJSON = function() {
      OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject <- list()
      if (!is.null(self$`manager.root`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['manager.root']] <- self$`manager.root`$toJSON()
      }
      if (!is.null(self$`http.service.filter`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['http.service.filter']] <- self$`http.service.filter`$toJSON()
      }
      if (!is.null(self$`default.render`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['default.render']] <- self$`default.render`$toJSON()
      }
      if (!is.null(self$`realm`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['realm']] <- self$`realm`$toJSON()
      }
      if (!is.null(self$`username`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['username']] <- self$`username`$toJSON()
      }
      if (!is.null(self$`password`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['password']] <- self$`password`$toJSON()
      }
      if (!is.null(self$`category`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['category']] <- self$`category`$toJSON()
      }
      if (!is.null(self$`locale`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['locale']] <- self$`locale`$toJSON()
      }
      if (!is.null(self$`loglevel`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['loglevel']] <- self$`loglevel`$toJSON()
      }
      if (!is.null(self$`plugins`)) {
        OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject[['plugins']] <- self$`plugins`$toJSON()
      }

      OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject
    },
    fromJSON = function(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesJson) {
      OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject <- jsonlite::fromJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesJson)
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`manager.root`)) {
        manager.rootObject <- ConfigNodePropertyString$new()
        manager.rootObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$manager.root, auto_unbox = TRUE))
        self$`manager.root` <- manager.rootObject
      }
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`http.service.filter`)) {
        http.service.filterObject <- ConfigNodePropertyString$new()
        http.service.filterObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$http.service.filter, auto_unbox = TRUE))
        self$`http.service.filter` <- http.service.filterObject
      }
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`default.render`)) {
        default.renderObject <- ConfigNodePropertyString$new()
        default.renderObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$default.render, auto_unbox = TRUE))
        self$`default.render` <- default.renderObject
      }
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`realm`)) {
        realmObject <- ConfigNodePropertyString$new()
        realmObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$realm, auto_unbox = TRUE))
        self$`realm` <- realmObject
      }
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`username`)) {
        usernameObject <- ConfigNodePropertyString$new()
        usernameObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$username, auto_unbox = TRUE))
        self$`username` <- usernameObject
      }
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`password`)) {
        passwordObject <- ConfigNodePropertyString$new()
        passwordObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$password, auto_unbox = TRUE))
        self$`password` <- passwordObject
      }
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`category`)) {
        categoryObject <- ConfigNodePropertyString$new()
        categoryObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$category, auto_unbox = TRUE))
        self$`category` <- categoryObject
      }
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`locale`)) {
        localeObject <- ConfigNodePropertyString$new()
        localeObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$locale, auto_unbox = TRUE))
        self$`locale` <- localeObject
      }
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`loglevel`)) {
        loglevelObject <- ConfigNodePropertyDropDown$new()
        loglevelObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$loglevel, auto_unbox = TRUE))
        self$`loglevel` <- loglevelObject
      }
      if (!is.null(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$`plugins`)) {
        pluginsObject <- ConfigNodePropertyDropDown$new()
        pluginsObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$plugins, auto_unbox = TRUE))
        self$`plugins` <- pluginsObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "manager.root": %s,
           "http.service.filter": %s,
           "default.render": %s,
           "realm": %s,
           "username": %s,
           "password": %s,
           "category": %s,
           "locale": %s,
           "loglevel": %s,
           "plugins": %s
        }',
        self$`manager.root`$toJSON(),
        self$`http.service.filter`$toJSON(),
        self$`default.render`$toJSON(),
        self$`realm`$toJSON(),
        self$`username`$toJSON(),
        self$`password`$toJSON(),
        self$`category`$toJSON(),
        self$`locale`$toJSON(),
        self$`loglevel`$toJSON(),
        self$`plugins`$toJSON()
      )
    },
    fromJSONString = function(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesJson) {
      OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject <- jsonlite::fromJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesJson)
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`manager.root` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$manager.root, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`http.service.filter` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$http.service.filter, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`default.render` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$default.render, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`realm` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$realm, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`username` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$username, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`password` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$password, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`category` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$category, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`locale` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$locale, auto_unbox = TRUE))
      ConfigNodePropertyDropDownObject <- ConfigNodePropertyDropDown$new()
      self$`loglevel` <- ConfigNodePropertyDropDownObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$loglevel, auto_unbox = TRUE))
      ConfigNodePropertyDropDownObject <- ConfigNodePropertyDropDown$new()
      self$`plugins` <- ConfigNodePropertyDropDownObject$fromJSON(jsonlite::toJSON(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesObject$plugins, auto_unbox = TRUE))
    }
  )
)
