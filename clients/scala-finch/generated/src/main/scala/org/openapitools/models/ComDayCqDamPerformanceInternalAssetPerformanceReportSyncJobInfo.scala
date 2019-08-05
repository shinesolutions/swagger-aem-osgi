package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties]
                )

object ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo {
    /**
     * Creates the codec for converting ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo] = deriveEncoder
}
