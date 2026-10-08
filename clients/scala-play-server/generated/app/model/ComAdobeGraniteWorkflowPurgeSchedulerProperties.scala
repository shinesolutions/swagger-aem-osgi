package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteWorkflowPurgeSchedulerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteWorkflowPurgeSchedulerProperties(
  scheduledpurgeName: Option[ConfigNodePropertyString],
  scheduledpurgeWorkflowStatus: Option[ConfigNodePropertyDropDown],
  scheduledpurgeModelIds: Option[ConfigNodePropertyArray],
  scheduledpurgeDaysold: Option[ConfigNodePropertyInteger]
)

object ComAdobeGraniteWorkflowPurgeSchedulerProperties {
  implicit lazy val comAdobeGraniteWorkflowPurgeSchedulerPropertiesJsonFormat: Format[ComAdobeGraniteWorkflowPurgeSchedulerProperties] = Json.format[ComAdobeGraniteWorkflowPurgeSchedulerProperties]
}

