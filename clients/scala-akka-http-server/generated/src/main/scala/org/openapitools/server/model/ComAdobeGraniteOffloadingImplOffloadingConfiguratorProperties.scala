package org.openapitools.server.model


/**
 * @param offloadingTransporter  for example: ''null''
 * @param offloadingCleanupPayload  for example: ''null''
*/
final case class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties (
  offloadingTransporter: Option[ConfigNodePropertyString] = None,
  offloadingCleanupPayload: Option[ConfigNodePropertyBoolean] = None
)

