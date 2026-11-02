package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties]
)

object ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo {
  implicit lazy val comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoJsonFormat: Format[ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo] = Json.format[ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo]
}

