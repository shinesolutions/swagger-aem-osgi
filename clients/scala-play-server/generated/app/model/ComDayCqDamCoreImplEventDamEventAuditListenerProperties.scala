package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplEventDamEventAuditListenerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplEventDamEventAuditListenerProperties(
  eventFilter: Option[ConfigNodePropertyString],
  enabled: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamCoreImplEventDamEventAuditListenerProperties {
  implicit lazy val comDayCqDamCoreImplEventDamEventAuditListenerPropertiesJsonFormat: Format[ComDayCqDamCoreImplEventDamEventAuditListenerProperties] = Json.format[ComDayCqDamCoreImplEventDamEventAuditListenerProperties]
}

