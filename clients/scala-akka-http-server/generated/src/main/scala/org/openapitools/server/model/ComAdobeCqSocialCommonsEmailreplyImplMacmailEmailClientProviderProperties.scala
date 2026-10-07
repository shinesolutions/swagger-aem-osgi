package org.openapitools.server.model


/**
 * @param priorityOrder  for example: ''null''
 * @param replyEmailPatterns  for example: ''null''
*/
final case class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties (
  priorityOrder: Option[ConfigNodePropertyInteger] = None,
  replyEmailPatterns: Option[ConfigNodePropertyArray] = None
)

