package org.openapitools.server.model


/**
 * @param automoderationSequence  for example: ''null''
 * @param automoderationOnfailurestop  for example: ''null''
*/
final case class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties (
  automoderationSequence: Option[ConfigNodePropertyArray] = None,
  automoderationOnfailurestop: Option[ConfigNodePropertyBoolean] = None
)

