package org.openapitools.server.model


/**
 * @param cqWcmMsmActionExcludednodetypes  for example: ''null''
 * @param cqWcmMsmActionExcludedparagraphitems  for example: ''null''
 * @param cqWcmMsmActionExcludedprops  for example: ''null''
 * @param contentcopyactionOrderStyle  for example: ''null''
*/
final case class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties (
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray] = None,
  cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray] = None,
  contentcopyactionOrderStyle: Option[ConfigNodePropertyDropDown] = None
)

