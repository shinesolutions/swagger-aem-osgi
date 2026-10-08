package org.openapitools.server.model


/**
 * @param excerptProperties  for example: ''null''
 * @param cacheMaxEntries  for example: ''null''
 * @param cacheEntryLifetime  for example: ''null''
 * @param xpathUnion  for example: ''null''
*/
final case class ComDayCqSearchImplBuilderQueryBuilderImplProperties (
  excerptProperties: Option[ConfigNodePropertyArray] = None,
  cacheMaxEntries: Option[ConfigNodePropertyInteger] = None,
  cacheEntryLifetime: Option[ConfigNodePropertyInteger] = None,
  xpathUnion: Option[ConfigNodePropertyBoolean] = None
)

