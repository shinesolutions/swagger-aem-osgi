package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(
  name: Option[ConfigNodePropertyString],
  `type`: Option[ConfigNodePropertyDropDown],
  formatTarget: Option[ConfigNodePropertyString],
  tempFsFolder: Option[ConfigNodePropertyString],
  fileThreshold: Option[ConfigNodePropertyInteger],
  memoryUnit: Option[ConfigNodePropertyDropDown],
  useOffHeapMemory: Option[ConfigNodePropertyBoolean],
  digestAlgorithm: Option[ConfigNodePropertyDropDown],
  monitoringQueueSize: Option[ConfigNodePropertyInteger],
  cleanupDelay: Option[ConfigNodePropertyInteger],
  packageFilters: Option[ConfigNodePropertyArray],
  propertyFilters: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {
  implicit lazy val orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesJsonFormat: Format[OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties] = Json.format[OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties]
}

