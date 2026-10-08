package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamVideoImplServletVideoTestServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamVideoImplServletVideoTestServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamVideoImplServletVideoTestServletProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComDayCqDamVideoImplServletVideoTestServletInfo {
  implicit lazy val comDayCqDamVideoImplServletVideoTestServletInfoJsonFormat: Format[ComDayCqDamVideoImplServletVideoTestServletInfo] = Json.format[ComDayCqDamVideoImplServletVideoTestServletInfo]
}

