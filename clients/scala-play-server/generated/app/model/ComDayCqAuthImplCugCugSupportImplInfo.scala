package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqAuthImplCugCugSupportImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqAuthImplCugCugSupportImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqAuthImplCugCugSupportImplProperties]
)

object ComDayCqAuthImplCugCugSupportImplInfo {
  implicit lazy val comDayCqAuthImplCugCugSupportImplInfoJsonFormat: Format[ComDayCqAuthImplCugCugSupportImplInfo] = Json.format[ComDayCqAuthImplCugCugSupportImplInfo]
}

