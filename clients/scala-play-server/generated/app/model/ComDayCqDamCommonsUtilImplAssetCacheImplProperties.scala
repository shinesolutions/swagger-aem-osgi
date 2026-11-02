package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCommonsUtilImplAssetCacheImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCommonsUtilImplAssetCacheImplProperties(
  largeFileMin: Option[ConfigNodePropertyInteger],
  cacheApply: Option[ConfigNodePropertyBoolean],
  mimeTypes: Option[ConfigNodePropertyArray]
)

object ComDayCqDamCommonsUtilImplAssetCacheImplProperties {
  implicit lazy val comDayCqDamCommonsUtilImplAssetCacheImplPropertiesJsonFormat: Format[ComDayCqDamCommonsUtilImplAssetCacheImplProperties] = Json.format[ComDayCqDamCommonsUtilImplAssetCacheImplProperties]
}

