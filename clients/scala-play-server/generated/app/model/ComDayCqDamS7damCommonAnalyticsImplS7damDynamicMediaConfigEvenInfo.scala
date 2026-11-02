package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties]
)

object ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo {
  implicit lazy val comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoJsonFormat: Format[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo] = Json.format[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo]
}

