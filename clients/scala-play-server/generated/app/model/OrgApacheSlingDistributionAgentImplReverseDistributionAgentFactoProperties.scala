package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties(
  name: Option[ConfigNodePropertyString],
  title: Option[ConfigNodePropertyString],
  details: Option[ConfigNodePropertyString],
  enabled: Option[ConfigNodePropertyBoolean],
  serviceName: Option[ConfigNodePropertyString],
  logLevel: Option[ConfigNodePropertyDropDown],
  queueProcessingEnabled: Option[ConfigNodePropertyBoolean],
  packageExporterEndpoints: Option[ConfigNodePropertyArray],
  pullItems: Option[ConfigNodePropertyInteger],
  httpConnTimeout: Option[ConfigNodePropertyInteger],
  requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString],
  transportSecretProviderTarget: Option[ConfigNodePropertyString],
  packageBuilderTarget: Option[ConfigNodePropertyString],
  triggersTarget: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties {
  implicit lazy val orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesJsonFormat: Format[OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties] = Json.format[OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties]
}

