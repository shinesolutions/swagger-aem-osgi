package org.openapitools.server.model


/**
 * @param cqWcmMsmActionExcludednodetypes  for example: ''null''
 * @param cqWcmMsmActionExcludedparagraphitems  for example: ''null''
 * @param cqWcmMsmActionExcludedprops  for example: ''null''
 * @param cqWcmMsmImplActionsPagemovePropReferenceUpdate  for example: ''null''
*/
final case class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties (
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmImplActionsPagemovePropReferenceUpdate: Option[ConfigNodePropertyBoolean] = None
)

