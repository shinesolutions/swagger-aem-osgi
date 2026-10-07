package org.openapitools.server.model


/**
 * @param threadPoolSize  for example: ''null''
 * @param delayTime  for example: ''null''
 * @param workerSleepTime  for example: ''null''
*/
final case class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties (
  threadPoolSize: Option[ConfigNodePropertyInteger] = None,
  delayTime: Option[ConfigNodePropertyInteger] = None,
  workerSleepTime: Option[ConfigNodePropertyInteger] = None
)

