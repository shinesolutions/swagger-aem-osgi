package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties(
  providerType: Option[ConfigNodePropertyDropDown]
)

object OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties {
  implicit lazy val orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesJsonFormat: Format[OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties] = Json.format[OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties]
}

