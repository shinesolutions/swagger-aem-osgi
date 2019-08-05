package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreStatsPageViewStatisticsImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmCoreStatsPageViewStatisticsImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreStatsPageViewStatisticsImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmCoreStatsPageViewStatisticsImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreStatsPageViewStatisticsImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreStatsPageViewStatisticsImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreStatsPageViewStatisticsImplInfo] = deriveEncoder
}
