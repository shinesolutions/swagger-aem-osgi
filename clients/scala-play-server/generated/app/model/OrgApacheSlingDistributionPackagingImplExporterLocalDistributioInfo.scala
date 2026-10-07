package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties]
)

object OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo {
  implicit lazy val orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoJsonFormat: Format[OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo] = Json.format[OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo]
}

