package org.openapitools.server.model


/**
 * @param serviceRanking  for example: ''null''
 * @param keypairId  for example: ''null''
 * @param keypairAlias  for example: ''null''
 * @param cdnrewriterAttributes  for example: ''null''
 * @param cdnRewriterDistributionDomain  for example: ''null''
*/
final case class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties (
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  keypairId: Option[ConfigNodePropertyString] = None,
  keypairAlias: Option[ConfigNodePropertyString] = None,
  cdnrewriterAttributes: Option[ConfigNodePropertyArray] = None,
  cdnRewriterDistributionDomain: Option[ConfigNodePropertyString] = None
)

