package org.openapitools.server.model


/**
 * @param diffPath  for example: ''null''
 * @param serviceName  for example: ''null''
 * @param serviceUserTarget  for example: ''null''
*/
final case class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties (
  diffPath: Option[ConfigNodePropertyString] = None,
  serviceName: Option[ConfigNodePropertyString] = None,
  serviceUserTarget: Option[ConfigNodePropertyString] = None
)

