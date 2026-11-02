package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(
  cqDamImageCacheMaxMemory: Option[ConfigNodePropertyInteger],
  cqDamImageCacheMaxAge: Option[ConfigNodePropertyInteger],
  cqDamImageCacheMaxDimension: Option[ConfigNodePropertyString]
)

object ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {
  implicit lazy val comDayCqDamCoreImplCacheCQBufferedImageCachePropertiesJsonFormat: Format[ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties] = Json.format[ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties]
}

