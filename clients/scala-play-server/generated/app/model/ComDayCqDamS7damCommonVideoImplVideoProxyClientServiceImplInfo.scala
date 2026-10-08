package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties]
)

object ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo {
  implicit lazy val comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoJsonFormat: Format[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo] = Json.format[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo]
}

