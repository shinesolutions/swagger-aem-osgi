package org.openapitools.server.model


/**
 * @param enable  for example: ''null''
 * @param uGCLimit  for example: ''null''
 * @param ugcLimitDuration  for example: ''null''
 * @param domains  for example: ''null''
 * @param toList  for example: ''null''
*/
final case class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties (
  enable: Option[ConfigNodePropertyBoolean] = None,
  uGCLimit: Option[ConfigNodePropertyInteger] = None,
  ugcLimitDuration: Option[ConfigNodePropertyInteger] = None,
  domains: Option[ConfigNodePropertyArray] = None,
  toList: Option[ConfigNodePropertyArray] = None
)

