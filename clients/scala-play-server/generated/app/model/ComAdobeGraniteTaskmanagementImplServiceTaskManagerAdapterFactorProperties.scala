package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(
  adapterCondition: Option[ConfigNodePropertyString],
  taskmanagerAdmingroups: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {
  implicit lazy val comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesJsonFormat: Format[ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties] = Json.format[ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties]
}

