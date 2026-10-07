package org.openapitools.server.model


/**
 * @param hcTags  for example: ''null''
 * @param webserverAddress  for example: ''null''
*/
final case class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties (
  hcTags: Option[ConfigNodePropertyArray] = None,
  webserverAddress: Option[ConfigNodePropertyString] = None
)

