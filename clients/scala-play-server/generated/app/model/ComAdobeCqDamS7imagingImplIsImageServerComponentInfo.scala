package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDamS7imagingImplIsImageServerComponentInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqDamS7imagingImplIsImageServerComponentProperties]
)

object ComAdobeCqDamS7imagingImplIsImageServerComponentInfo {
  implicit lazy val comAdobeCqDamS7imagingImplIsImageServerComponentInfoJsonFormat: Format[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo] = Json.format[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo]
}

