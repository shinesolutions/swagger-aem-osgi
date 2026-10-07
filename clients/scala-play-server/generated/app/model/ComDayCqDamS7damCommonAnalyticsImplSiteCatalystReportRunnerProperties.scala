package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(
  schedulerExpression: Option[ConfigNodePropertyString],
  schedulerConcurrent: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties {
  implicit lazy val comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesJsonFormat: Format[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties] = Json.format[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties]
}

