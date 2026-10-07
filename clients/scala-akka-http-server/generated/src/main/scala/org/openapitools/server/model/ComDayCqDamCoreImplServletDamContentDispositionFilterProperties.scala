package org.openapitools.server.model


/**
 * @param cqMimeTypeBlacklist  for example: ''null''
 * @param cqDamEmptyMime  for example: ''null''
*/
final case class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties (
  cqMimeTypeBlacklist: Option[ConfigNodePropertyArray] = None,
  cqDamEmptyMime: Option[ConfigNodePropertyBoolean] = None
)

