/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(
  name: Option[ConfigNodePropertyString],

  `type`: Option[ConfigNodePropertyDropDown],

  importMode: Option[ConfigNodePropertyString],

  aclHandling: Option[ConfigNodePropertyString],

  packagePeriodroots: Option[ConfigNodePropertyString],

  packagePeriodfilters: Option[ConfigNodePropertyArray],

  propertyPeriodfilters: Option[ConfigNodePropertyArray],

  tempFsFolder: Option[ConfigNodePropertyString],

  useBinaryReferences: Option[ConfigNodePropertyBoolean],

  autoSaveThreshold: Option[ConfigNodePropertyInteger],

  cleanupDelay: Option[ConfigNodePropertyInteger],

  fileThreshold: Option[ConfigNodePropertyInteger],

  MEGAUnderscoreBYTES: Option[ConfigNodePropertyDropDown],

  useOffHeapMemory: Option[ConfigNodePropertyBoolean],

  digestAlgorithm: Option[ConfigNodePropertyDropDown],

  monitoringQueueSize: Option[ConfigNodePropertyInteger],

  pathsMapping: Option[ConfigNodePropertyArray],

  strictImport: Option[ConfigNodePropertyBoolean]

 )