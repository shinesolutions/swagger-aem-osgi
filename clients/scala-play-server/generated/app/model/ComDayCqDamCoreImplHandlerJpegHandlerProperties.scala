package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplHandlerJpegHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplHandlerJpegHandlerProperties(
  cqDamEnableExtMetaExtraction: Option[ConfigNodePropertyBoolean],
  largeFileThreshold: Option[ConfigNodePropertyInteger],
  largeCommentThreshold: Option[ConfigNodePropertyInteger]
)

object ComDayCqDamCoreImplHandlerJpegHandlerProperties {
  implicit lazy val comDayCqDamCoreImplHandlerJpegHandlerPropertiesJsonFormat: Format[ComDayCqDamCoreImplHandlerJpegHandlerProperties] = Json.format[ComDayCqDamCoreImplHandlerJpegHandlerProperties]
}

