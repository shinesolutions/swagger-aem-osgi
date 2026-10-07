package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(
  batchCommitSize: Option[ConfigNodePropertyInteger]
)

object ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties {
  implicit lazy val comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesJsonFormat: Format[ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties] = Json.format[ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties]
}

