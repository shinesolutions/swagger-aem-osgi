package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplServletAssetDownloadServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplServletAssetDownloadServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamCoreImplServletAssetDownloadServletProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComDayCqDamCoreImplServletAssetDownloadServletInfo {
  implicit lazy val comDayCqDamCoreImplServletAssetDownloadServletInfoJsonFormat: Format[ComDayCqDamCoreImplServletAssetDownloadServletInfo] = Json.format[ComDayCqDamCoreImplServletAssetDownloadServletInfo]
}

