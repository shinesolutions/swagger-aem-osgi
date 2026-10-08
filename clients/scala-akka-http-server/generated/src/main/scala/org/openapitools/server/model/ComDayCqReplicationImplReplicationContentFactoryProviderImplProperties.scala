package org.openapitools.server.model


/**
 * @param replicationContentUseFileStorage  for example: ''null''
 * @param replicationContentMaxCommitAttempts  for example: ''null''
*/
final case class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties (
  replicationContentUseFileStorage: Option[ConfigNodePropertyBoolean] = None,
  replicationContentMaxCommitAttempts: Option[ConfigNodePropertyInteger] = None
)

