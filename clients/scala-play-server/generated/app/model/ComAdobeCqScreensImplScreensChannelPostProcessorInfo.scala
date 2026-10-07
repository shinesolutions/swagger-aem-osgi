package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScreensImplScreensChannelPostProcessorInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScreensImplScreensChannelPostProcessorInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqScreensImplScreensChannelPostProcessorProperties]
)

object ComAdobeCqScreensImplScreensChannelPostProcessorInfo {
  implicit lazy val comAdobeCqScreensImplScreensChannelPostProcessorInfoJsonFormat: Format[ComAdobeCqScreensImplScreensChannelPostProcessorInfo] = Json.format[ComAdobeCqScreensImplScreensChannelPostProcessorInfo]
}

