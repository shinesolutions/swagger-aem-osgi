package org.openapitools.server.model


/**
 * @param cqDamWebdavVersionLinkingEnable  for example: ''null''
 * @param cqDamWebdavVersionLinkingSchedulerPeriod  for example: ''null''
 * @param cqDamWebdavVersionLinkingStagingTimeout  for example: ''null''
*/
final case class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties (
  cqDamWebdavVersionLinkingEnable: Option[ConfigNodePropertyBoolean] = None,
  cqDamWebdavVersionLinkingSchedulerPeriod: Option[ConfigNodePropertyInteger] = None,
  cqDamWebdavVersionLinkingStagingTimeout: Option[ConfigNodePropertyInteger] = None
)

