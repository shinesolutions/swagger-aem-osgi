package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(
  datasources: Option[ConfigNodePropertyArray],
  step: Option[ConfigNodePropertyInteger],
  archives: Option[ConfigNodePropertyArray],
  path: Option[ConfigNodePropertyString]
)

object OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {
  implicit lazy val orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesJsonFormat: Format[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties] = Json.format[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties]
}

