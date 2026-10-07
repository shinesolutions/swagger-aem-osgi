package org.openapitools.server.model


/**
 * @param dmreplicateonmodifyEnabled  for example: ''null''
 * @param dmreplicateonmodifyForcesyncdeletes  for example: ''null''
*/
final case class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties (
  dmreplicateonmodifyEnabled: Option[ConfigNodePropertyBoolean] = None,
  dmreplicateonmodifyForcesyncdeletes: Option[ConfigNodePropertyBoolean] = None
)

