package org.openapitools.server.model


/**
 * @param clusterLevelEnable  for example: ''null''
 * @param clusterMasterLevel  for example: ''null''
 * @param clusterSlaveLevel  for example: ''null''
*/
final case class ComDayCqJcrclustersupportClusterStartLevelControllerProperties (
  clusterLevelEnable: Option[ConfigNodePropertyBoolean] = None,
  clusterMasterLevel: Option[ConfigNodePropertyInteger] = None,
  clusterSlaveLevel: Option[ConfigNodePropertyInteger] = None
)

