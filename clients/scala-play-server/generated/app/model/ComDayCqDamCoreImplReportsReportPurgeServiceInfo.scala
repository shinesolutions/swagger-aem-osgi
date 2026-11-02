package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplReportsReportPurgeServiceInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplReportsReportPurgeServiceInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamCoreImplReportsReportPurgeServiceProperties]
)

object ComDayCqDamCoreImplReportsReportPurgeServiceInfo {
  implicit lazy val comDayCqDamCoreImplReportsReportPurgeServiceInfoJsonFormat: Format[ComDayCqDamCoreImplReportsReportPurgeServiceInfo] = Json.format[ComDayCqDamCoreImplReportsReportPurgeServiceInfo]
}

