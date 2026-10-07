package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplDamEventRecorderImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplDamEventRecorderImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamCoreImplDamEventRecorderImplProperties]
)

object ComDayCqDamCoreImplDamEventRecorderImplInfo {
  implicit lazy val comDayCqDamCoreImplDamEventRecorderImplInfoJsonFormat: Format[ComDayCqDamCoreImplDamEventRecorderImplInfo] = Json.format[ComDayCqDamCoreImplDamEventRecorderImplInfo]
}

