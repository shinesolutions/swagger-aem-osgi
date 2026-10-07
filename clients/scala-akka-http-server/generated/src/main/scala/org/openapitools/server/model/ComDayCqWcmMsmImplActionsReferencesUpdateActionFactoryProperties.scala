package org.openapitools.server.model


/**
 * @param cqWcmMsmActionExcludednodetypes  for example: ''null''
 * @param cqWcmMsmActionExcludedparagraphitems  for example: ''null''
 * @param cqWcmMsmActionExcludedprops  for example: ''null''
 * @param cqWcmMsmImplActionReferencesupdatePropUpdateNested  for example: ''null''
*/
final case class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties (
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmImplActionReferencesupdatePropUpdateNested: Option[ConfigNodePropertyBoolean] = None
)

