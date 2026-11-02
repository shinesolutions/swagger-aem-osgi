package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo {
  implicit lazy val orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoJsonFormat: Format[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo] = Json.format[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo]
}

