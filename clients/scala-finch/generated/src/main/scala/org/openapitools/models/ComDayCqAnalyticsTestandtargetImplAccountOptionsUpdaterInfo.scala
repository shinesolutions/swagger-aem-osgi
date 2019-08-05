package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties]
                )

object ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo] = deriveEncoder
}
