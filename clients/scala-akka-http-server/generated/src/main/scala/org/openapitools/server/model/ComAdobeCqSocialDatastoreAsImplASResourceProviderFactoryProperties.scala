package org.openapitools.server.model


/**
 * @param versionId  for example: ''null''
 * @param cacheOn  for example: ''null''
 * @param concurrencyLevel  for example: ''null''
 * @param cacheStartSize  for example: ''null''
 * @param cacheTtl  for example: ''null''
 * @param cacheSize  for example: ''null''
 * @param timeLimit  for example: ''null''
*/
final case class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties (
  versionId: Option[ConfigNodePropertyString] = None,
  cacheOn: Option[ConfigNodePropertyBoolean] = None,
  concurrencyLevel: Option[ConfigNodePropertyInteger] = None,
  cacheStartSize: Option[ConfigNodePropertyInteger] = None,
  cacheTtl: Option[ConfigNodePropertyInteger] = None,
  cacheSize: Option[ConfigNodePropertyInteger] = None,
  timeLimit: Option[ConfigNodePropertyInteger] = None
)

