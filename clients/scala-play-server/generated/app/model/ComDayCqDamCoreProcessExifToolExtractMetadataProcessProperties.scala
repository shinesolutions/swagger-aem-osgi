package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties(
  processLabel: Option[ConfigNodePropertyString],
  cqDamEnableSha1: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties {
  implicit lazy val comDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesJsonFormat: Format[ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties] = Json.format[ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties]
}

