package org.openapitools.server.model


/**
 * @param cqDamBatchCollectionsProperties  for example: ''null''
 * @param cqDamBatchCollectionsLimit  for example: ''null''
*/
final case class ComDayCqDamCoreImplServletCollectionsServletProperties (
  cqDamBatchCollectionsProperties: Option[ConfigNodePropertyArray] = None,
  cqDamBatchCollectionsLimit: Option[ConfigNodePropertyInteger] = None
)

