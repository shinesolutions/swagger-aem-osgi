package org.openapitools.server.model


/**
 * @param historyRequestFilterExcludedSelectors  for example: ''null''
 * @param historyRequestFilterExcludedExtensions  for example: ''null''
*/
final case class ComAdobeCqHistoryImplHistoryRequestFilterProperties (
  historyRequestFilterExcludedSelectors: Option[ConfigNodePropertyArray] = None,
  historyRequestFilterExcludedExtensions: Option[ConfigNodePropertyArray] = None
)

