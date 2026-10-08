package org.openapitools.server.model


/**
 * @param enabled  for example: ''null''
 * @param disabledForGroups  for example: ''null''
*/
final case class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties (
  enabled: Option[ConfigNodePropertyBoolean] = None,
  disabledForGroups: Option[ConfigNodePropertyArray] = None
)

