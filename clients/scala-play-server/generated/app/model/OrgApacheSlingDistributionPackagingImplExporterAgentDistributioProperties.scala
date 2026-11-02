package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(
  name: Option[ConfigNodePropertyString],
  queue: Option[ConfigNodePropertyString],
  dropInvalidItems: Option[ConfigNodePropertyBoolean],
  agentTarget: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties {
  implicit lazy val orgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesJsonFormat: Format[OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties] = Json.format[OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties]
}

