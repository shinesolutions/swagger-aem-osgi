package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties]
                )

object ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo] = deriveEncoder
}
