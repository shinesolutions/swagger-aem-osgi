package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(
  defaultTimeout: Option[ConfigNodePropertyInteger],
  maxTimeout: Option[ConfigNodePropertyInteger],
  defaultPeriod: Option[ConfigNodePropertyInteger]
)

object ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {
  implicit lazy val comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesJsonFormat: Format[ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties] = Json.format[ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties]
}

