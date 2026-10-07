package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param serviceName  for example: ''null''
 * @param userId  for example: ''null''
 * @param accessTokenProviderTarget  for example: ''null''
*/
final case class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties (
  name: Option[ConfigNodePropertyString] = None,
  serviceName: Option[ConfigNodePropertyString] = None,
  userId: Option[ConfigNodePropertyString] = None,
  accessTokenProviderTarget: Option[ConfigNodePropertyString] = None
)

