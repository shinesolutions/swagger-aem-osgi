package org.openapitools.server.model


/**
 * @param largeFileMin  for example: ''null''
 * @param cacheApply  for example: ''null''
 * @param mimeTypes  for example: ''null''
*/
final case class ComDayCqDamCommonsUtilImplAssetCacheImplProperties (
  largeFileMin: Option[ConfigNodePropertyInteger] = None,
  cacheApply: Option[ConfigNodePropertyBoolean] = None,
  mimeTypes: Option[ConfigNodePropertyArray] = None
)

