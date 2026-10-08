package org.openapitools.server.model


/**
 * @param serviceRanking  for example: ''null''
 * @param typeCollections  for example: ''null''
 * @param typeNoncollections  for example: ''null''
 * @param typeContent  for example: ''null''
*/
final case class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties (
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  typeCollections: Option[ConfigNodePropertyString] = None,
  typeNoncollections: Option[ConfigNodePropertyString] = None,
  typeContent: Option[ConfigNodePropertyString] = None
)

