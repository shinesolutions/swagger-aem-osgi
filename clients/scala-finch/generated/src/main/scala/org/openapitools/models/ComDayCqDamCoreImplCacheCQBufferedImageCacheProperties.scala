package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodmemory 
 * @param cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodage 
 * @param cqPerioddamPeriodimagePeriodcachePeriodmaxPerioddimension 
 */
case class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodmemory: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodage: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodimagePeriodcachePeriodmaxPerioddimension: Option[ConfigNodePropertyString]
                )

object ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties] = deriveEncoder
}
