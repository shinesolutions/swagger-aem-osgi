# Adobe Experience Manager OSGI config (AEM) API
#
# Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
#
# OpenAPI spec version: 1.0.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' ComAdobeCqScreensDeviceImplDeviceServiceProperties Class
#'
#' @field com.adobe.aem.screens.player.pingfrequency 
#' @field com.adobe.aem.screens.device.pasword.specialchars 
#' @field com.adobe.aem.screens.device.pasword.minlowercasechars 
#' @field com.adobe.aem.screens.device.pasword.minuppercasechars 
#' @field com.adobe.aem.screens.device.pasword.minnumberchars 
#' @field com.adobe.aem.screens.device.pasword.minspecialchars 
#' @field com.adobe.aem.screens.device.pasword.minlength 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ComAdobeCqScreensDeviceImplDeviceServiceProperties <- R6::R6Class(
  'ComAdobeCqScreensDeviceImplDeviceServiceProperties',
  public = list(
    `com.adobe.aem.screens.player.pingfrequency` = NULL,
    `com.adobe.aem.screens.device.pasword.specialchars` = NULL,
    `com.adobe.aem.screens.device.pasword.minlowercasechars` = NULL,
    `com.adobe.aem.screens.device.pasword.minuppercasechars` = NULL,
    `com.adobe.aem.screens.device.pasword.minnumberchars` = NULL,
    `com.adobe.aem.screens.device.pasword.minspecialchars` = NULL,
    `com.adobe.aem.screens.device.pasword.minlength` = NULL,
    initialize = function(`com.adobe.aem.screens.player.pingfrequency`, `com.adobe.aem.screens.device.pasword.specialchars`, `com.adobe.aem.screens.device.pasword.minlowercasechars`, `com.adobe.aem.screens.device.pasword.minuppercasechars`, `com.adobe.aem.screens.device.pasword.minnumberchars`, `com.adobe.aem.screens.device.pasword.minspecialchars`, `com.adobe.aem.screens.device.pasword.minlength`){
      if (!missing(`com.adobe.aem.screens.player.pingfrequency`)) {
        stopifnot(R6::is.R6(`com.adobe.aem.screens.player.pingfrequency`))
        self$`com.adobe.aem.screens.player.pingfrequency` <- `com.adobe.aem.screens.player.pingfrequency`
      }
      if (!missing(`com.adobe.aem.screens.device.pasword.specialchars`)) {
        stopifnot(R6::is.R6(`com.adobe.aem.screens.device.pasword.specialchars`))
        self$`com.adobe.aem.screens.device.pasword.specialchars` <- `com.adobe.aem.screens.device.pasword.specialchars`
      }
      if (!missing(`com.adobe.aem.screens.device.pasword.minlowercasechars`)) {
        stopifnot(R6::is.R6(`com.adobe.aem.screens.device.pasword.minlowercasechars`))
        self$`com.adobe.aem.screens.device.pasword.minlowercasechars` <- `com.adobe.aem.screens.device.pasword.minlowercasechars`
      }
      if (!missing(`com.adobe.aem.screens.device.pasword.minuppercasechars`)) {
        stopifnot(R6::is.R6(`com.adobe.aem.screens.device.pasword.minuppercasechars`))
        self$`com.adobe.aem.screens.device.pasword.minuppercasechars` <- `com.adobe.aem.screens.device.pasword.minuppercasechars`
      }
      if (!missing(`com.adobe.aem.screens.device.pasword.minnumberchars`)) {
        stopifnot(R6::is.R6(`com.adobe.aem.screens.device.pasword.minnumberchars`))
        self$`com.adobe.aem.screens.device.pasword.minnumberchars` <- `com.adobe.aem.screens.device.pasword.minnumberchars`
      }
      if (!missing(`com.adobe.aem.screens.device.pasword.minspecialchars`)) {
        stopifnot(R6::is.R6(`com.adobe.aem.screens.device.pasword.minspecialchars`))
        self$`com.adobe.aem.screens.device.pasword.minspecialchars` <- `com.adobe.aem.screens.device.pasword.minspecialchars`
      }
      if (!missing(`com.adobe.aem.screens.device.pasword.minlength`)) {
        stopifnot(R6::is.R6(`com.adobe.aem.screens.device.pasword.minlength`))
        self$`com.adobe.aem.screens.device.pasword.minlength` <- `com.adobe.aem.screens.device.pasword.minlength`
      }
    },
    toJSON = function() {
      ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject <- list()
      if (!is.null(self$`com.adobe.aem.screens.player.pingfrequency`)) {
        ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject[['com.adobe.aem.screens.player.pingfrequency']] <- self$`com.adobe.aem.screens.player.pingfrequency`$toJSON()
      }
      if (!is.null(self$`com.adobe.aem.screens.device.pasword.specialchars`)) {
        ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject[['com.adobe.aem.screens.device.pasword.specialchars']] <- self$`com.adobe.aem.screens.device.pasword.specialchars`$toJSON()
      }
      if (!is.null(self$`com.adobe.aem.screens.device.pasword.minlowercasechars`)) {
        ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject[['com.adobe.aem.screens.device.pasword.minlowercasechars']] <- self$`com.adobe.aem.screens.device.pasword.minlowercasechars`$toJSON()
      }
      if (!is.null(self$`com.adobe.aem.screens.device.pasword.minuppercasechars`)) {
        ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject[['com.adobe.aem.screens.device.pasword.minuppercasechars']] <- self$`com.adobe.aem.screens.device.pasword.minuppercasechars`$toJSON()
      }
      if (!is.null(self$`com.adobe.aem.screens.device.pasword.minnumberchars`)) {
        ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject[['com.adobe.aem.screens.device.pasword.minnumberchars']] <- self$`com.adobe.aem.screens.device.pasword.minnumberchars`$toJSON()
      }
      if (!is.null(self$`com.adobe.aem.screens.device.pasword.minspecialchars`)) {
        ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject[['com.adobe.aem.screens.device.pasword.minspecialchars']] <- self$`com.adobe.aem.screens.device.pasword.minspecialchars`$toJSON()
      }
      if (!is.null(self$`com.adobe.aem.screens.device.pasword.minlength`)) {
        ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject[['com.adobe.aem.screens.device.pasword.minlength']] <- self$`com.adobe.aem.screens.device.pasword.minlength`$toJSON()
      }

      ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject
    },
    fromJSON = function(ComAdobeCqScreensDeviceImplDeviceServicePropertiesJson) {
      ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject <- jsonlite::fromJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesJson)
      if (!is.null(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$`com.adobe.aem.screens.player.pingfrequency`)) {
        com.adobe.aem.screens.player.pingfrequencyObject <- ConfigNodePropertyInteger$new()
        com.adobe.aem.screens.player.pingfrequencyObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.player.pingfrequency, auto_unbox = TRUE))
        self$`com.adobe.aem.screens.player.pingfrequency` <- com.adobe.aem.screens.player.pingfrequencyObject
      }
      if (!is.null(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$`com.adobe.aem.screens.device.pasword.specialchars`)) {
        com.adobe.aem.screens.device.pasword.specialcharsObject <- ConfigNodePropertyString$new()
        com.adobe.aem.screens.device.pasword.specialcharsObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.specialchars, auto_unbox = TRUE))
        self$`com.adobe.aem.screens.device.pasword.specialchars` <- com.adobe.aem.screens.device.pasword.specialcharsObject
      }
      if (!is.null(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$`com.adobe.aem.screens.device.pasword.minlowercasechars`)) {
        com.adobe.aem.screens.device.pasword.minlowercasecharsObject <- ConfigNodePropertyInteger$new()
        com.adobe.aem.screens.device.pasword.minlowercasecharsObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minlowercasechars, auto_unbox = TRUE))
        self$`com.adobe.aem.screens.device.pasword.minlowercasechars` <- com.adobe.aem.screens.device.pasword.minlowercasecharsObject
      }
      if (!is.null(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$`com.adobe.aem.screens.device.pasword.minuppercasechars`)) {
        com.adobe.aem.screens.device.pasword.minuppercasecharsObject <- ConfigNodePropertyInteger$new()
        com.adobe.aem.screens.device.pasword.minuppercasecharsObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minuppercasechars, auto_unbox = TRUE))
        self$`com.adobe.aem.screens.device.pasword.minuppercasechars` <- com.adobe.aem.screens.device.pasword.minuppercasecharsObject
      }
      if (!is.null(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$`com.adobe.aem.screens.device.pasword.minnumberchars`)) {
        com.adobe.aem.screens.device.pasword.minnumbercharsObject <- ConfigNodePropertyInteger$new()
        com.adobe.aem.screens.device.pasword.minnumbercharsObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minnumberchars, auto_unbox = TRUE))
        self$`com.adobe.aem.screens.device.pasword.minnumberchars` <- com.adobe.aem.screens.device.pasword.minnumbercharsObject
      }
      if (!is.null(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$`com.adobe.aem.screens.device.pasword.minspecialchars`)) {
        com.adobe.aem.screens.device.pasword.minspecialcharsObject <- ConfigNodePropertyInteger$new()
        com.adobe.aem.screens.device.pasword.minspecialcharsObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minspecialchars, auto_unbox = TRUE))
        self$`com.adobe.aem.screens.device.pasword.minspecialchars` <- com.adobe.aem.screens.device.pasword.minspecialcharsObject
      }
      if (!is.null(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$`com.adobe.aem.screens.device.pasword.minlength`)) {
        com.adobe.aem.screens.device.pasword.minlengthObject <- ConfigNodePropertyInteger$new()
        com.adobe.aem.screens.device.pasword.minlengthObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minlength, auto_unbox = TRUE))
        self$`com.adobe.aem.screens.device.pasword.minlength` <- com.adobe.aem.screens.device.pasword.minlengthObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "com.adobe.aem.screens.player.pingfrequency": %s,
           "com.adobe.aem.screens.device.pasword.specialchars": %s,
           "com.adobe.aem.screens.device.pasword.minlowercasechars": %s,
           "com.adobe.aem.screens.device.pasword.minuppercasechars": %s,
           "com.adobe.aem.screens.device.pasword.minnumberchars": %s,
           "com.adobe.aem.screens.device.pasword.minspecialchars": %s,
           "com.adobe.aem.screens.device.pasword.minlength": %s
        }',
        self$`com.adobe.aem.screens.player.pingfrequency`$toJSON(),
        self$`com.adobe.aem.screens.device.pasword.specialchars`$toJSON(),
        self$`com.adobe.aem.screens.device.pasword.minlowercasechars`$toJSON(),
        self$`com.adobe.aem.screens.device.pasword.minuppercasechars`$toJSON(),
        self$`com.adobe.aem.screens.device.pasword.minnumberchars`$toJSON(),
        self$`com.adobe.aem.screens.device.pasword.minspecialchars`$toJSON(),
        self$`com.adobe.aem.screens.device.pasword.minlength`$toJSON()
      )
    },
    fromJSONString = function(ComAdobeCqScreensDeviceImplDeviceServicePropertiesJson) {
      ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject <- jsonlite::fromJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesJson)
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`com.adobe.aem.screens.player.pingfrequency` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.player.pingfrequency, auto_unbox = TRUE))
      ConfigNodePropertyStringObject <- ConfigNodePropertyString$new()
      self$`com.adobe.aem.screens.device.pasword.specialchars` <- ConfigNodePropertyStringObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.specialchars, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`com.adobe.aem.screens.device.pasword.minlowercasechars` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minlowercasechars, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`com.adobe.aem.screens.device.pasword.minuppercasechars` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minuppercasechars, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`com.adobe.aem.screens.device.pasword.minnumberchars` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minnumberchars, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`com.adobe.aem.screens.device.pasword.minspecialchars` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minspecialchars, auto_unbox = TRUE))
      ConfigNodePropertyIntegerObject <- ConfigNodePropertyInteger$new()
      self$`com.adobe.aem.screens.device.pasword.minlength` <- ConfigNodePropertyIntegerObject$fromJSON(jsonlite::toJSON(ComAdobeCqScreensDeviceImplDeviceServicePropertiesObject$com.adobe.aem.screens.device.pasword.minlength, auto_unbox = TRUE))
    }
  )
)