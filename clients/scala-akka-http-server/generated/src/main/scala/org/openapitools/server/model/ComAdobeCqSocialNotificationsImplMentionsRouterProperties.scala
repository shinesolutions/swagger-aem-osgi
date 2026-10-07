package org.openapitools.server.model


/**
 * @param eventTopics  for example: ''null''
 * @param eventFilter  for example: ''null''
*/
final case class ComAdobeCqSocialNotificationsImplMentionsRouterProperties (
  eventTopics: Option[ConfigNodePropertyString] = None,
  eventFilter: Option[ConfigNodePropertyString] = None
)

