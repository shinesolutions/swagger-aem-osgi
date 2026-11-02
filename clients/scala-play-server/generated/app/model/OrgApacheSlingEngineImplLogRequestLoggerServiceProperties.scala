package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEngineImplLogRequestLoggerServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(
  requestLogServiceFormat: Option[ConfigNodePropertyString],
  requestLogServiceOutput: Option[ConfigNodePropertyString],
  requestLogServiceOutputtype: Option[ConfigNodePropertyDropDown],
  requestLogServiceOnentry: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {
  implicit lazy val orgApacheSlingEngineImplLogRequestLoggerServicePropertiesJsonFormat: Format[OrgApacheSlingEngineImplLogRequestLoggerServiceProperties] = Json.format[OrgApacheSlingEngineImplLogRequestLoggerServiceProperties]
}

