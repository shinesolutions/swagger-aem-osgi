package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(
  adapterCondition: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties {
  implicit lazy val comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesJsonFormat: Format[ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties] = Json.format[ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties]
}

