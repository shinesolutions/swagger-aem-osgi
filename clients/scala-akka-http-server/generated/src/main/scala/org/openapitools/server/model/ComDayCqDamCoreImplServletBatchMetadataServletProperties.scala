package org.openapitools.server.model


/**
 * @param cqDamBatchMetadataAssetDefault  for example: ''null''
 * @param cqDamBatchMetadataCollectionDefault  for example: ''null''
 * @param cqDamBatchMetadataMaxresources  for example: ''null''
*/
final case class ComDayCqDamCoreImplServletBatchMetadataServletProperties (
  cqDamBatchMetadataAssetDefault: Option[ConfigNodePropertyArray] = None,
  cqDamBatchMetadataCollectionDefault: Option[ConfigNodePropertyArray] = None,
  cqDamBatchMetadataMaxresources: Option[ConfigNodePropertyInteger] = None
)

