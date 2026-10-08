package org.openapitools.server.model


/**
 * @param indexingCriticalThreshold  for example: ''null''
 * @param indexingWarnThreshold  for example: ''null''
 * @param hcTags  for example: ''null''
*/
final case class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties (
  indexingCriticalThreshold: Option[ConfigNodePropertyInteger] = None,
  indexingWarnThreshold: Option[ConfigNodePropertyInteger] = None,
  hcTags: Option[ConfigNodePropertyArray] = None
)

