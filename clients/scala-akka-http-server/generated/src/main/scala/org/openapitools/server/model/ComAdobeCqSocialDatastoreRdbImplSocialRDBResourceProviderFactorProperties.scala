package org.openapitools.server.model


/**
 * @param solrZkTimeout  for example: ''null''
 * @param solrCommit  for example: ''null''
 * @param cacheOn  for example: ''null''
 * @param concurrencyLevel  for example: ''null''
 * @param cacheStartSize  for example: ''null''
 * @param cacheTtl  for example: ''null''
 * @param cacheSize  for example: ''null''
*/
final case class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties (
  solrZkTimeout: Option[ConfigNodePropertyString] = None,
  solrCommit: Option[ConfigNodePropertyString] = None,
  cacheOn: Option[ConfigNodePropertyBoolean] = None,
  concurrencyLevel: Option[ConfigNodePropertyInteger] = None,
  cacheStartSize: Option[ConfigNodePropertyInteger] = None,
  cacheTtl: Option[ConfigNodePropertyInteger] = None,
  cacheSize: Option[ConfigNodePropertyInteger] = None
)

