package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties]
)

object ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo {
  implicit lazy val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoJsonFormat: Format[ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo] = Json.format[ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo]
}

