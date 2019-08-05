package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCommonsUtilImplAssetCacheImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCommonsUtilImplAssetCacheImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCommonsUtilImplAssetCacheImplProperties]
                )

object ComDayCqDamCommonsUtilImplAssetCacheImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamCommonsUtilImplAssetCacheImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCommonsUtilImplAssetCacheImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCommonsUtilImplAssetCacheImplInfo] = deriveEncoder
}
