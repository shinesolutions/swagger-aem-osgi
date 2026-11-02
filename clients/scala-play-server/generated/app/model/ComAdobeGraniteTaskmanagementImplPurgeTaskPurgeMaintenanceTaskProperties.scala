package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(
  purgeCompleted: Option[ConfigNodePropertyBoolean],
  completedAge: Option[ConfigNodePropertyInteger],
  purgeActive: Option[ConfigNodePropertyBoolean],
  activeAge: Option[ConfigNodePropertyInteger],
  saveThreshold: Option[ConfigNodePropertyInteger]
)

object ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {
  implicit lazy val comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesJsonFormat: Format[ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties] = Json.format[ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties]
}

