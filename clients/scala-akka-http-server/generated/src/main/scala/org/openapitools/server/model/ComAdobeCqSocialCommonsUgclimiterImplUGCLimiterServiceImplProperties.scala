package org.openapitools.server.model


/**
 * @param eventTopics  for example: ''null''
 * @param eventFilter  for example: ''null''
 * @param verbs  for example: ''null''
*/
final case class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties (
  eventTopics: Option[ConfigNodePropertyString] = None,
  eventFilter: Option[ConfigNodePropertyString] = None,
  verbs: Option[ConfigNodePropertyArray] = None
)

