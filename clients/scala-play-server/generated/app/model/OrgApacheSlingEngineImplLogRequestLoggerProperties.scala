package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEngineImplLogRequestLoggerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEngineImplLogRequestLoggerProperties(
  requestLogOutput: Option[ConfigNodePropertyString],
  requestLogOutputtype: Option[ConfigNodePropertyDropDown],
  requestLogEnabled: Option[ConfigNodePropertyBoolean],
  accessLogOutput: Option[ConfigNodePropertyString],
  accessLogOutputtype: Option[ConfigNodePropertyDropDown],
  accessLogEnabled: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingEngineImplLogRequestLoggerProperties {
  implicit lazy val orgApacheSlingEngineImplLogRequestLoggerPropertiesJsonFormat: Format[OrgApacheSlingEngineImplLogRequestLoggerProperties] = Json.format[OrgApacheSlingEngineImplLogRequestLoggerProperties]
}

