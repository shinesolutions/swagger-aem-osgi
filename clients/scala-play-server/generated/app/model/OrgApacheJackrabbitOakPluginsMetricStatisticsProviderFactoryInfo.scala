package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties]
)

object OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo {
  implicit lazy val orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoJsonFormat: Format[OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo] = Json.format[OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo]
}

