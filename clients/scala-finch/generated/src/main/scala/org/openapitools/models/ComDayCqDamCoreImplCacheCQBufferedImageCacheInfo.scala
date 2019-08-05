package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties]
                )

object ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo] = deriveEncoder
}
