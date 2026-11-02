package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(
  eventFilter: Option[ConfigNodePropertyString],
  launchesEventhandlerThreadpoolMaxsize: Option[ConfigNodePropertyInteger],
  launchesEventhandlerThreadpoolPriority: Option[ConfigNodePropertyDropDown],
  launchesEventhandlerUpdatelastmodification: Option[ConfigNodePropertyBoolean]
)

object ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {
  implicit lazy val comAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesJsonFormat: Format[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties] = Json.format[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties]
}

