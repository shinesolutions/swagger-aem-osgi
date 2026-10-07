package org.openapitools.server.model


/**
 * @param dtmStagingIpWhitelist  for example: ''null''
 * @param dtmProductionIpWhitelist  for example: ''null''
*/
final case class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties (
  dtmStagingIpWhitelist: Option[ConfigNodePropertyArray] = None,
  dtmProductionIpWhitelist: Option[ConfigNodePropertyArray] = None
)

