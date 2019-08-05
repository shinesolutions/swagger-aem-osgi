package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param largePeriodfilePeriodmin 
 * @param cachePeriodapply 
 * @param mimePeriodtypes 
 */
case class ComDayCqDamCommonsUtilImplAssetCacheImplProperties(largePeriodfilePeriodmin: Option[ConfigNodePropertyInteger],
                cachePeriodapply: Option[ConfigNodePropertyBoolean],
                mimePeriodtypes: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCommonsUtilImplAssetCacheImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamCommonsUtilImplAssetCacheImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCommonsUtilImplAssetCacheImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCommonsUtilImplAssetCacheImplProperties] = deriveEncoder
}
