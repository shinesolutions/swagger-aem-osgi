package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScheduledExporterImplScheduledExporterImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScheduledExporterImplScheduledExporterImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqScheduledExporterImplScheduledExporterImplProperties]
)

object ComAdobeCqScheduledExporterImplScheduledExporterImplInfo {
  implicit lazy val comAdobeCqScheduledExporterImplScheduledExporterImplInfoJsonFormat: Format[ComAdobeCqScheduledExporterImplScheduledExporterImplInfo] = Json.format[ComAdobeCqScheduledExporterImplScheduledExporterImplInfo]
}

