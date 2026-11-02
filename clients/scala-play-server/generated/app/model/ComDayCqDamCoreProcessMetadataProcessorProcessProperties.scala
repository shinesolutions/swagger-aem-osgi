package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreProcessMetadataProcessorProcessProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreProcessMetadataProcessorProcessProperties(
  processLabel: Option[ConfigNodePropertyString],
  cqDamEnableSha1: Option[ConfigNodePropertyBoolean],
  cqDamMetadataXssprotectedProperties: Option[ConfigNodePropertyArray]
)

object ComDayCqDamCoreProcessMetadataProcessorProcessProperties {
  implicit lazy val comDayCqDamCoreProcessMetadataProcessorProcessPropertiesJsonFormat: Format[ComDayCqDamCoreProcessMetadataProcessorProcessProperties] = Json.format[ComDayCqDamCoreProcessMetadataProcessorProcessProperties]
}

