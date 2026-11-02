package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(
  name: Option[ConfigNodePropertyString],
  `type`: Option[ConfigNodePropertyDropDown],
  importMode: Option[ConfigNodePropertyString],
  aclHandling: Option[ConfigNodePropertyString],
  packageRoots: Option[ConfigNodePropertyString],
  packageFilters: Option[ConfigNodePropertyArray],
  propertyFilters: Option[ConfigNodePropertyArray],
  tempFsFolder: Option[ConfigNodePropertyString],
  useBinaryReferences: Option[ConfigNodePropertyBoolean],
  autoSaveThreshold: Option[ConfigNodePropertyInteger],
  cleanupDelay: Option[ConfigNodePropertyInteger],
  fileThreshold: Option[ConfigNodePropertyInteger],
  MEGA_BYTES: Option[ConfigNodePropertyDropDown],
  useOffHeapMemory: Option[ConfigNodePropertyBoolean],
  digestAlgorithm: Option[ConfigNodePropertyDropDown],
  monitoringQueueSize: Option[ConfigNodePropertyInteger],
  pathsMapping: Option[ConfigNodePropertyArray],
  strictImport: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties {
  implicit lazy val orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesJsonFormat: Format[OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties] = Json.format[OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties]
}

