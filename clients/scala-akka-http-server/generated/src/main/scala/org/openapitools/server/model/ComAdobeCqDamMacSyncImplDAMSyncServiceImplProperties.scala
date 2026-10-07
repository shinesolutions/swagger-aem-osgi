package org.openapitools.server.model


/**
 * @param comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths  for example: ''null''
 * @param comAdobeCqDamMacSyncDamsyncserviceSyncRenditions  for example: ''null''
 * @param comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs  for example: ''null''
 * @param comAdobeCqDamMacSyncDamsyncservicePlatform  for example: ''null''
*/
final case class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties (
  comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: Option[ConfigNodePropertyArray] = None,
  comAdobeCqDamMacSyncDamsyncserviceSyncRenditions: Option[ConfigNodePropertyBoolean] = None,
  comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: Option[ConfigNodePropertyInteger] = None,
  comAdobeCqDamMacSyncDamsyncservicePlatform: Option[ConfigNodePropertyDropDown] = None
)

