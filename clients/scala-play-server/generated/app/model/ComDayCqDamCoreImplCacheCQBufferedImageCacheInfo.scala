package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplCacheCQBufferedImageCacheInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties]
)

object ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo {
  implicit lazy val comDayCqDamCoreImplCacheCQBufferedImageCacheInfoJsonFormat: Format[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo] = Json.format[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo]
}

