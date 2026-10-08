package org.openapitools.server.model


/**
 * @param serviceRanking  for example: ''null''
 * @param cdnrewriterAttributes  for example: ''null''
 * @param cdnRewriterDistributionDomain  for example: ''null''
*/
final case class ComAdobeCqCdnRewriterImplCDNRewriterProperties (
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  cdnrewriterAttributes: Option[ConfigNodePropertyArray] = None,
  cdnRewriterDistributionDomain: Option[ConfigNodePropertyString] = None
)

