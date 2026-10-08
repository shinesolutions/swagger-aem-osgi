package org.openapitools.server.model


/**
 * @param numberOfRetriesAllowed  for example: ''null''
 * @param hcTags  for example: ''null''
*/
final case class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties (
  numberOfRetriesAllowed: Option[ConfigNodePropertyInteger] = None,
  hcTags: Option[ConfigNodePropertyArray] = None
)

