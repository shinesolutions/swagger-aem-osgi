package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties]
                )

object ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo] = deriveEncoder
}
