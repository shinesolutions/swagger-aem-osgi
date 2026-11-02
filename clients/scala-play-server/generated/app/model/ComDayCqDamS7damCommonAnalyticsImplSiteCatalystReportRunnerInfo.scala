package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties]
)

object ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo {
  implicit lazy val comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoJsonFormat: Format[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo] = Json.format[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo]
}

