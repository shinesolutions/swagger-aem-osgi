package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties]
)

object ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo {
  implicit lazy val comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoJsonFormat: Format[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo] = Json.format[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo]
}

