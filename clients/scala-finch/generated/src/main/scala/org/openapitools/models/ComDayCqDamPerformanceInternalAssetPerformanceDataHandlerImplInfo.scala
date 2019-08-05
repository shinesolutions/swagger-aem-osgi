package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties]
                )

object ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo] = deriveEncoder
}
