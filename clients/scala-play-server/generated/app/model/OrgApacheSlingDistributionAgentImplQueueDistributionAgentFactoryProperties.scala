package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(
  name: Option[ConfigNodePropertyString],
  title: Option[ConfigNodePropertyString],
  details: Option[ConfigNodePropertyString],
  enabled: Option[ConfigNodePropertyBoolean],
  serviceName: Option[ConfigNodePropertyString],
  logLevel: Option[ConfigNodePropertyDropDown],
  allowedRoots: Option[ConfigNodePropertyArray],
  requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString],
  queueProviderFactoryTarget: Option[ConfigNodePropertyString],
  packageBuilderTarget: Option[ConfigNodePropertyString],
  triggersTarget: Option[ConfigNodePropertyString],
  priorityQueues: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {
  implicit lazy val orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesJsonFormat: Format[OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties] = Json.format[OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties]
}

