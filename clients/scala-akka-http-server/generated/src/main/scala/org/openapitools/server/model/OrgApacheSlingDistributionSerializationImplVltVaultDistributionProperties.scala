package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param `type`  for example: ''null''
 * @param importMode  for example: ''null''
 * @param aclHandling  for example: ''null''
 * @param packageRoots  for example: ''null''
 * @param packageFilters  for example: ''null''
 * @param propertyFilters  for example: ''null''
 * @param tempFsFolder  for example: ''null''
 * @param useBinaryReferences  for example: ''null''
 * @param autoSaveThreshold  for example: ''null''
 * @param cleanupDelay  for example: ''null''
 * @param fileThreshold  for example: ''null''
 * @param MEGA_BYTES  for example: ''null''
 * @param useOffHeapMemory  for example: ''null''
 * @param digestAlgorithm  for example: ''null''
 * @param monitoringQueueSize  for example: ''null''
 * @param pathsMapping  for example: ''null''
 * @param strictImport  for example: ''null''
*/
final case class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties (
  name: Option[ConfigNodePropertyString] = None,
  `type`: Option[ConfigNodePropertyDropDown] = None,
  importMode: Option[ConfigNodePropertyString] = None,
  aclHandling: Option[ConfigNodePropertyString] = None,
  packageRoots: Option[ConfigNodePropertyString] = None,
  packageFilters: Option[ConfigNodePropertyArray] = None,
  propertyFilters: Option[ConfigNodePropertyArray] = None,
  tempFsFolder: Option[ConfigNodePropertyString] = None,
  useBinaryReferences: Option[ConfigNodePropertyBoolean] = None,
  autoSaveThreshold: Option[ConfigNodePropertyInteger] = None,
  cleanupDelay: Option[ConfigNodePropertyInteger] = None,
  fileThreshold: Option[ConfigNodePropertyInteger] = None,
  MEGA_BYTES: Option[ConfigNodePropertyDropDown] = None,
  useOffHeapMemory: Option[ConfigNodePropertyBoolean] = None,
  digestAlgorithm: Option[ConfigNodePropertyDropDown] = None,
  monitoringQueueSize: Option[ConfigNodePropertyInteger] = None,
  pathsMapping: Option[ConfigNodePropertyArray] = None,
  strictImport: Option[ConfigNodePropertyBoolean] = None
)

