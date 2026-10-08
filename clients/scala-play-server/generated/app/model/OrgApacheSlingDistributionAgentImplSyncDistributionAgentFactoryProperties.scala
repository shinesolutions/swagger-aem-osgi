package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties(
  name: Option[ConfigNodePropertyString],
  title: Option[ConfigNodePropertyString],
  details: Option[ConfigNodePropertyString],
  enabled: Option[ConfigNodePropertyBoolean],
  serviceName: Option[ConfigNodePropertyString],
  logLevel: Option[ConfigNodePropertyDropDown],
  queueProcessingEnabled: Option[ConfigNodePropertyBoolean],
  passiveQueues: Option[ConfigNodePropertyArray],
  packageExporterEndpoints: Option[ConfigNodePropertyArray],
  packageImporterEndpoints: Option[ConfigNodePropertyArray],
  retryStrategy: Option[ConfigNodePropertyDropDown],
  retryAttempts: Option[ConfigNodePropertyInteger],
  pullItems: Option[ConfigNodePropertyInteger],
  httpConnTimeout: Option[ConfigNodePropertyInteger],
  requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString],
  transportSecretProviderTarget: Option[ConfigNodePropertyString],
  packageBuilderTarget: Option[ConfigNodePropertyString],
  triggersTarget: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {
  implicit lazy val orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesJsonFormat: Format[OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties] = Json.format[OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties]
}

