package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties]
)

object ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo {
  implicit lazy val comAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoJsonFormat: Format[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo] = Json.format[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo]
}

