package org.openapitools.server.model


/**
 * @param getCacheExpirationUnit  for example: ''null''
 * @param getCacheExpirationValue  for example: ''null''
*/
final case class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties (
  getCacheExpirationUnit: Option[ConfigNodePropertyDropDown] = None,
  getCacheExpirationValue: Option[ConfigNodePropertyInteger] = None
)

