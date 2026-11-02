package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCommonsMetricsInternalLogReporterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCommonsMetricsInternalLogReporterProperties(
  period: Option[ConfigNodePropertyInteger],
  timeUnit: Option[ConfigNodePropertyDropDown],
  level: Option[ConfigNodePropertyDropDown],
  loggerName: Option[ConfigNodePropertyString],
  prefix: Option[ConfigNodePropertyString],
  pattern: Option[ConfigNodePropertyString],
  registryName: Option[ConfigNodePropertyString]
)

object OrgApacheSlingCommonsMetricsInternalLogReporterProperties {
  implicit lazy val orgApacheSlingCommonsMetricsInternalLogReporterPropertiesJsonFormat: Format[OrgApacheSlingCommonsMetricsInternalLogReporterProperties] = Json.format[OrgApacheSlingCommonsMetricsInternalLogReporterProperties]
}

