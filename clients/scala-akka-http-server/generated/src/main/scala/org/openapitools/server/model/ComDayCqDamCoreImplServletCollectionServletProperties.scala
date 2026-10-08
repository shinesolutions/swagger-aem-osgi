package org.openapitools.server.model


/**
 * @param cqDamBatchCollectionProperties  for example: ''null''
 * @param cqDamBatchCollectionMaxcollections  for example: ''null''
*/
final case class ComDayCqDamCoreImplServletCollectionServletProperties (
  cqDamBatchCollectionProperties: Option[ConfigNodePropertyArray] = None,
  cqDamBatchCollectionMaxcollections: Option[ConfigNodePropertyInteger] = None
)

