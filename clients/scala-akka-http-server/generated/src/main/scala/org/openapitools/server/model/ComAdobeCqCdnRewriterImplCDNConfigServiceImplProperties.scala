package org.openapitools.server.model


/**
 * @param cdnConfigDistributionDomain  for example: ''null''
 * @param cdnConfigEnableRewriting  for example: ''null''
 * @param cdnConfigPathPrefixes  for example: ''null''
 * @param cdnConfigCdnttl  for example: ''null''
 * @param cdnConfigApplicationProtocol  for example: ''null''
*/
final case class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties (
  cdnConfigDistributionDomain: Option[ConfigNodePropertyString] = None,
  cdnConfigEnableRewriting: Option[ConfigNodePropertyBoolean] = None,
  cdnConfigPathPrefixes: Option[ConfigNodePropertyArray] = None,
  cdnConfigCdnttl: Option[ConfigNodePropertyInteger] = None,
  cdnConfigApplicationProtocol: Option[ConfigNodePropertyString] = None
)

