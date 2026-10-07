package org.openapitools.server.model


/**
 * @param largeIndexCriticalThreshold  for example: ''null''
 * @param largeIndexWarnThreshold  for example: ''null''
 * @param hcTags  for example: ''null''
*/
final case class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties (
  largeIndexCriticalThreshold: Option[ConfigNodePropertyInteger] = None,
  largeIndexWarnThreshold: Option[ConfigNodePropertyInteger] = None,
  hcTags: Option[ConfigNodePropertyArray] = None
)

