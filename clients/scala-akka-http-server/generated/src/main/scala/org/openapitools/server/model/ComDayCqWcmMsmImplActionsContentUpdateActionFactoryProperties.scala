package org.openapitools.server.model


/**
 * @param cqWcmMsmActionExcludednodetypes  for example: ''null''
 * @param cqWcmMsmActionExcludedparagraphitems  for example: ''null''
 * @param cqWcmMsmActionExcludedprops  for example: ''null''
 * @param cqWcmMsmActionIgnoredMixin  for example: ''null''
*/
final case class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties (
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmActionIgnoredMixin: Option[ConfigNodePropertyArray] = None
)

