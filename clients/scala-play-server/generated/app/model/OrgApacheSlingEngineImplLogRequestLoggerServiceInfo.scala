package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEngineImplLogRequestLoggerServiceInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEngineImplLogRequestLoggerServiceInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingEngineImplLogRequestLoggerServiceProperties]
)

object OrgApacheSlingEngineImplLogRequestLoggerServiceInfo {
  implicit lazy val orgApacheSlingEngineImplLogRequestLoggerServiceInfoJsonFormat: Format[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo] = Json.format[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo]
}

