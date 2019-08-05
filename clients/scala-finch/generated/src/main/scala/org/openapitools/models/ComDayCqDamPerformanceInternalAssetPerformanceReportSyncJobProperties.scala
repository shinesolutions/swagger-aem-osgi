package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodexpression 
 */
case class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString]
                )

object ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties {
    /**
     * Creates the codec for converting ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties] = deriveEncoder
}
