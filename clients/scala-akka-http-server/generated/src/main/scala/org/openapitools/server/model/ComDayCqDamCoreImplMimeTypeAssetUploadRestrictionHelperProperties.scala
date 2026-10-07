package org.openapitools.server.model


/**
 * @param cqDamAllowAllMime  for example: ''null''
 * @param cqDamAllowedAssetMimes  for example: ''null''
*/
final case class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties (
  cqDamAllowAllMime: Option[ConfigNodePropertyBoolean] = None,
  cqDamAllowedAssetMimes: Option[ConfigNodePropertyArray] = None
)

