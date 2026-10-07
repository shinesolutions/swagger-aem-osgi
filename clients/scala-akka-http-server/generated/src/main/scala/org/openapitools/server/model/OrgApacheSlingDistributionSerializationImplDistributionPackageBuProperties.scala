package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param `type`  for example: ''null''
 * @param formatTarget  for example: ''null''
 * @param tempFsFolder  for example: ''null''
 * @param fileThreshold  for example: ''null''
 * @param memoryUnit  for example: ''null''
 * @param useOffHeapMemory  for example: ''null''
 * @param digestAlgorithm  for example: ''null''
 * @param monitoringQueueSize  for example: ''null''
 * @param cleanupDelay  for example: ''null''
 * @param packageFilters  for example: ''null''
 * @param propertyFilters  for example: ''null''
*/
final case class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties (
  name: Option[ConfigNodePropertyString] = None,
  `type`: Option[ConfigNodePropertyDropDown] = None,
  formatTarget: Option[ConfigNodePropertyString] = None,
  tempFsFolder: Option[ConfigNodePropertyString] = None,
  fileThreshold: Option[ConfigNodePropertyInteger] = None,
  memoryUnit: Option[ConfigNodePropertyDropDown] = None,
  useOffHeapMemory: Option[ConfigNodePropertyBoolean] = None,
  digestAlgorithm: Option[ConfigNodePropertyDropDown] = None,
  monitoringQueueSize: Option[ConfigNodePropertyInteger] = None,
  cleanupDelay: Option[ConfigNodePropertyInteger] = None,
  packageFilters: Option[ConfigNodePropertyArray] = None,
  propertyFilters: Option[ConfigNodePropertyArray] = None
)

