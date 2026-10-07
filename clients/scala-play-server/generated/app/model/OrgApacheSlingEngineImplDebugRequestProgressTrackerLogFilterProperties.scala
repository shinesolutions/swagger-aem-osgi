package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(
  extensions: Option[ConfigNodePropertyArray],
  minDurationMs: Option[ConfigNodePropertyInteger],
  maxDurationMs: Option[ConfigNodePropertyInteger],
  compactLogFormat: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {
  implicit lazy val orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesJsonFormat: Format[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties] = Json.format[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties]
}

