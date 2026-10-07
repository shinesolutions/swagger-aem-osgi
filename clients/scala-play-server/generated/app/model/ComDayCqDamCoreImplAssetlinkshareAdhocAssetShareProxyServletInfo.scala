package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties]
)

object ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo {
  implicit lazy val comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoJsonFormat: Format[ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo] = Json.format[ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo]
}

