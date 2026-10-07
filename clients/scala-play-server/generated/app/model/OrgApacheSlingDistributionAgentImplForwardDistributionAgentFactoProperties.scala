package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties(
  name: Option[ConfigNodePropertyString],
  title: Option[ConfigNodePropertyString],
  details: Option[ConfigNodePropertyString],
  enabled: Option[ConfigNodePropertyBoolean],
  serviceName: Option[ConfigNodePropertyString],
  logLevel: Option[ConfigNodePropertyDropDown],
  allowedRoots: Option[ConfigNodePropertyArray],
  queueProcessingEnabled: Option[ConfigNodePropertyBoolean],
  packageImporterEndpoints: Option[ConfigNodePropertyArray],
  passiveQueues: Option[ConfigNodePropertyArray],
  priorityQueues: Option[ConfigNodePropertyArray],
  retryStrategy: Option[ConfigNodePropertyDropDown],
  retryAttempts: Option[ConfigNodePropertyInteger],
  requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString],
  transportSecretProviderTarget: Option[ConfigNodePropertyString],
  packageBuilderTarget: Option[ConfigNodePropertyString],
  triggersTarget: Option[ConfigNodePropertyString],
  queueProvider: Option[ConfigNodePropertyDropDown],
  asyncDelivery: Option[ConfigNodePropertyBoolean],
  httpConnTimeout: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties {
  implicit lazy val orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesJsonFormat: Format[OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties] = Json.format[OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties]
}

