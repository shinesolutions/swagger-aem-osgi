package org.openapitools.server.model


/**
 * @param cacheEnable  for example: ''null''
 * @param cacheRootPaths  for example: ''null''
 * @param cacheMaxSize  for example: ''null''
 * @param cacheMaxEntries  for example: ''null''
*/
final case class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties (
  cacheEnable: Option[ConfigNodePropertyBoolean] = None,
  cacheRootPaths: Option[ConfigNodePropertyArray] = None,
  cacheMaxSize: Option[ConfigNodePropertyInteger] = None,
  cacheMaxEntries: Option[ConfigNodePropertyInteger] = None
)

