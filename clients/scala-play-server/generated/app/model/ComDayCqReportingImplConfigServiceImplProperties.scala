package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqReportingImplConfigServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqReportingImplConfigServiceImplProperties(
  repconfTimezone: Option[ConfigNodePropertyString],
  repconfLocale: Option[ConfigNodePropertyString],
  repconfSnapshots: Option[ConfigNodePropertyString],
  repconfRepdir: Option[ConfigNodePropertyString],
  repconfHourofday: Option[ConfigNodePropertyInteger],
  repconfMinofhour: Option[ConfigNodePropertyInteger],
  repconfMaxrows: Option[ConfigNodePropertyInteger],
  repconfFakedata: Option[ConfigNodePropertyBoolean],
  repconfSnapshotuser: Option[ConfigNodePropertyString],
  repconfEnforcesnapshotuser: Option[ConfigNodePropertyBoolean]
)

object ComDayCqReportingImplConfigServiceImplProperties {
  implicit lazy val comDayCqReportingImplConfigServiceImplPropertiesJsonFormat: Format[ComDayCqReportingImplConfigServiceImplProperties] = Json.format[ComDayCqReportingImplConfigServiceImplProperties]
}

