package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplServletAssetStatusServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplServletAssetStatusServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamCoreImplServletAssetStatusServletProperties]
)

object ComDayCqDamCoreImplServletAssetStatusServletInfo {
  implicit lazy val comDayCqDamCoreImplServletAssetStatusServletInfoJsonFormat: Format[ComDayCqDamCoreImplServletAssetStatusServletInfo] = Json.format[ComDayCqDamCoreImplServletAssetStatusServletInfo]
}

