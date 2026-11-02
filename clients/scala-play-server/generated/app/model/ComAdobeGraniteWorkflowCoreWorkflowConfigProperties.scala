package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteWorkflowCoreWorkflowConfigProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(
  cqWorkflowConfigWorkflowPackagesRootPath: Option[ConfigNodePropertyArray],
  cqWorkflowConfigWorkflowProcessLegacyMode: Option[ConfigNodePropertyBoolean],
  cqWorkflowConfigAllowLocking: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {
  implicit lazy val comAdobeGraniteWorkflowCoreWorkflowConfigPropertiesJsonFormat: Format[ComAdobeGraniteWorkflowCoreWorkflowConfigProperties] = Json.format[ComAdobeGraniteWorkflowCoreWorkflowConfigProperties]
}

