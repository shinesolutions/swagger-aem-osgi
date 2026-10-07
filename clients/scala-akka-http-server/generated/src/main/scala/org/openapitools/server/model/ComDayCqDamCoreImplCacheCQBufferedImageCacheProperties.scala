package org.openapitools.server.model


/**
 * @param cqDamImageCacheMaxMemory  for example: ''null''
 * @param cqDamImageCacheMaxAge  for example: ''null''
 * @param cqDamImageCacheMaxDimension  for example: ''null''
*/
final case class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties (
  cqDamImageCacheMaxMemory: Option[ConfigNodePropertyInteger] = None,
  cqDamImageCacheMaxAge: Option[ConfigNodePropertyInteger] = None,
  cqDamImageCacheMaxDimension: Option[ConfigNodePropertyString] = None
)

