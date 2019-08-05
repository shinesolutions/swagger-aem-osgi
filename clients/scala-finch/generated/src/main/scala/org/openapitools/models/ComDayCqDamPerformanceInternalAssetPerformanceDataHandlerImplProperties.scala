package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param batchPeriodcommitPeriodsize 
 */
case class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(batchPeriodcommitPeriodsize: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties] = deriveEncoder
}
