package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(
  name: Option[ConfigNodePropertyString],
  title: Option[ConfigNodePropertyString],
  details: Option[ConfigNodePropertyString],
  enabled: Option[ConfigNodePropertyBoolean],
  serviceName: Option[ConfigNodePropertyString],
  logLevel: Option[ConfigNodePropertyDropDown],
  queueProcessingEnabled: Option[ConfigNodePropertyBoolean],
  packageExporterTarget: Option[ConfigNodePropertyString],
  packageImporterTarget: Option[ConfigNodePropertyString],
  requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString],
  triggersTarget: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {
  implicit lazy val orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesJsonFormat: Format[OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties] = Json.format[OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties]
}

