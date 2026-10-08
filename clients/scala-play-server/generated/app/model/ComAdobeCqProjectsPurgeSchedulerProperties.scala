package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqProjectsPurgeSchedulerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqProjectsPurgeSchedulerProperties(
  scheduledpurgeName: Option[ConfigNodePropertyString],
  scheduledpurgePurgeActive: Option[ConfigNodePropertyBoolean],
  scheduledpurgeTemplates: Option[ConfigNodePropertyArray],
  scheduledpurgePurgeGroups: Option[ConfigNodePropertyBoolean],
  scheduledpurgePurgeAssets: Option[ConfigNodePropertyBoolean],
  scheduledpurgeTerminateRunningWorkflows: Option[ConfigNodePropertyBoolean],
  scheduledpurgeDaysold: Option[ConfigNodePropertyInteger],
  scheduledpurgeSaveThreshold: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqProjectsPurgeSchedulerProperties {
  implicit lazy val comAdobeCqProjectsPurgeSchedulerPropertiesJsonFormat: Format[ComAdobeCqProjectsPurgeSchedulerProperties] = Json.format[ComAdobeCqProjectsPurgeSchedulerProperties]
}

