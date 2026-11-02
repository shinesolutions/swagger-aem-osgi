package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDamS7imagingImplPsPlatformServerServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties]
)

object ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo {
  implicit lazy val comAdobeCqDamS7imagingImplPsPlatformServerServletInfoJsonFormat: Format[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo] = Json.format[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo]
}

