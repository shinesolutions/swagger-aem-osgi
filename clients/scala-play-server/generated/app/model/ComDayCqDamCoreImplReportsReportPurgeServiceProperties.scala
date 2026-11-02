package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplReportsReportPurgeServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplReportsReportPurgeServiceProperties(
  schedulerExpression: Option[ConfigNodePropertyString],
  maxSavedReports: Option[ConfigNodePropertyInteger],
  timeDuration: Option[ConfigNodePropertyInteger],
  enableReportPurge: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamCoreImplReportsReportPurgeServiceProperties {
  implicit lazy val comDayCqDamCoreImplReportsReportPurgeServicePropertiesJsonFormat: Format[ComDayCqDamCoreImplReportsReportPurgeServiceProperties] = Json.format[ComDayCqDamCoreImplReportsReportPurgeServiceProperties]
}

