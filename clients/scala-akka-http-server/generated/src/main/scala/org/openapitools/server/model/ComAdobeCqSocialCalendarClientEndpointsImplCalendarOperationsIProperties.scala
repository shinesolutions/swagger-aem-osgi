package org.openapitools.server.model


/**
 * @param maxRetry  for example: ''null''
 * @param fieldWhitelist  for example: ''null''
 * @param attachmentTypeBlacklist  for example: ''null''
*/
final case class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties (
  maxRetry: Option[ConfigNodePropertyInteger] = None,
  fieldWhitelist: Option[ConfigNodePropertyArray] = None,
  attachmentTypeBlacklist: Option[ConfigNodePropertyArray] = None
)

