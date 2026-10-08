package org.openapitools.server.model


/**
 * @param maxWaitTime  for example: ''null''
 * @param minWaitBetweenRetries  for example: ''null''
*/
final case class ComAdobeCqSocialGroupImplGroupServiceImplProperties (
  maxWaitTime: Option[ConfigNodePropertyInteger] = None,
  minWaitBetweenRetries: Option[ConfigNodePropertyInteger] = None
)

