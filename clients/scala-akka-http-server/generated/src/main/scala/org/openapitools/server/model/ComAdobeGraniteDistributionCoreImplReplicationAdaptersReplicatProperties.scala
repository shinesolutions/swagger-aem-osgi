package org.openapitools.server.model


/**
 * @param providerName  for example: ''null''
 * @param forwardRequests  for example: ''null''
*/
final case class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties (
  providerName: Option[ConfigNodePropertyString] = None,
  forwardRequests: Option[ConfigNodePropertyBoolean] = None
)

