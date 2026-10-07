package org.openapitools.server.model


/**
 * @param poolSize  for example: ''null''
 * @param maxPoolSize  for example: ''null''
 * @param queueSize  for example: ''null''
 * @param keepAliveTime  for example: ''null''
*/
final case class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties (
  poolSize: Option[ConfigNodePropertyInteger] = None,
  maxPoolSize: Option[ConfigNodePropertyInteger] = None,
  queueSize: Option[ConfigNodePropertyInteger] = None,
  keepAliveTime: Option[ConfigNodePropertyInteger] = None
)

