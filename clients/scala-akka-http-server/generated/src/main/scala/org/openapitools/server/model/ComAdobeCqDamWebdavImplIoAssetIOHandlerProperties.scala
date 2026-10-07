package org.openapitools.server.model


/**
 * @param serviceRanking  for example: ''null''
 * @param pathPrefix  for example: ''null''
 * @param createVersion  for example: ''null''
*/
final case class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties (
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  pathPrefix: Option[ConfigNodePropertyString] = None,
  createVersion: Option[ConfigNodePropertyBoolean] = None
)

