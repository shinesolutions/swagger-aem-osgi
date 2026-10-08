package org.openapitools.server.model


/**
 * @param enable  for example: ''null''
 * @param ttl1  for example: ''null''
 * @param ttl2  for example: ''null''
*/
final case class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties (
  enable: Option[ConfigNodePropertyBoolean] = None,
  ttl1: Option[ConfigNodePropertyInteger] = None,
  ttl2: Option[ConfigNodePropertyInteger] = None
)

