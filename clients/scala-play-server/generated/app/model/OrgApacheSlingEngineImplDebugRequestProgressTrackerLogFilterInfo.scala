package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties]
)

object OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo {
  implicit lazy val orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoJsonFormat: Format[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo] = Json.format[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo]
}

