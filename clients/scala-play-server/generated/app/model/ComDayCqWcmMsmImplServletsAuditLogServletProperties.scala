package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMsmImplServletsAuditLogServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMsmImplServletsAuditLogServletProperties(
  auditlogservletDefaultEventsCount: Option[ConfigNodePropertyInteger],
  auditlogservletDefaultPath: Option[ConfigNodePropertyString]
)

object ComDayCqWcmMsmImplServletsAuditLogServletProperties {
  implicit lazy val comDayCqWcmMsmImplServletsAuditLogServletPropertiesJsonFormat: Format[ComDayCqWcmMsmImplServletsAuditLogServletProperties] = Json.format[ComDayCqWcmMsmImplServletsAuditLogServletProperties]
}

