package org.openapitools.server.model


/**
 * @param enableScheduledPostsSearch  for example: ''null''
 * @param numberOfMinutes  for example: ''null''
 * @param maxSearchLimit  for example: ''null''
*/
final case class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties (
  enableScheduledPostsSearch: Option[ConfigNodePropertyBoolean] = None,
  numberOfMinutes: Option[ConfigNodePropertyInteger] = None,
  maxSearchLimit: Option[ConfigNodePropertyInteger] = None
)

