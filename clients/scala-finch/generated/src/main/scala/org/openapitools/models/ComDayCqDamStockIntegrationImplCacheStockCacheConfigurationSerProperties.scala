package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param getCacheExpirationUnit 
 * @param getCacheExpirationValue 
 */
case class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(getCacheExpirationUnit: Option[ConfigNodePropertyDropDown],
                getCacheExpirationValue: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties {
    /**
     * Creates the codec for converting ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties] = deriveEncoder
}
