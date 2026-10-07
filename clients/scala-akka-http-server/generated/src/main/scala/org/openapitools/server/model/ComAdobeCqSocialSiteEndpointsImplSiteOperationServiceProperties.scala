package org.openapitools.server.model


/**
 * @param fieldWhitelist  for example: ''null''
 * @param sitePathFilters  for example: ''null''
 * @param sitePackageGroup  for example: ''null''
*/
final case class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties (
  fieldWhitelist: Option[ConfigNodePropertyArray] = None,
  sitePathFilters: Option[ConfigNodePropertyArray] = None,
  sitePackageGroup: Option[ConfigNodePropertyString] = None
)

