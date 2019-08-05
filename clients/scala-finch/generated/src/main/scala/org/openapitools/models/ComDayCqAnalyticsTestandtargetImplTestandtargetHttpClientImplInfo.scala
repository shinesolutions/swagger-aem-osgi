package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties]
                )

object ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo] = deriveEncoder
}
