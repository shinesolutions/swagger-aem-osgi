package org.openapitools.server.model


/**
 * @param receiverTmpfileThreshold  for example: ''null''
 * @param receiverPackagesUseInstall  for example: ''null''
*/
final case class ComDayCqReplicationImplReplicationReceiverImplProperties (
  receiverTmpfileThreshold: Option[ConfigNodePropertyInteger] = None,
  receiverPackagesUseInstall: Option[ConfigNodePropertyBoolean] = None
)

