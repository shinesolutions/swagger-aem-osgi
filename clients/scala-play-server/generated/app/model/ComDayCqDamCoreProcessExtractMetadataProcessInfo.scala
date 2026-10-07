package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreProcessExtractMetadataProcessInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreProcessExtractMetadataProcessInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamCoreProcessExtractMetadataProcessProperties]
)

object ComDayCqDamCoreProcessExtractMetadataProcessInfo {
  implicit lazy val comDayCqDamCoreProcessExtractMetadataProcessInfoJsonFormat: Format[ComDayCqDamCoreProcessExtractMetadataProcessInfo] = Json.format[ComDayCqDamCoreProcessExtractMetadataProcessInfo]
}

