package org.openapitools.server.model


/**
 * @param repcacheEnable  for example: ''null''
 * @param repcacheTtl  for example: ''null''
 * @param repcacheMax  for example: ''null''
*/
final case class ComDayCqReportingImplCacheCacheImplProperties (
  repcacheEnable: Option[ConfigNodePropertyBoolean] = None,
  repcacheTtl: Option[ConfigNodePropertyInteger] = None,
  repcacheMax: Option[ConfigNodePropertyInteger] = None
)

