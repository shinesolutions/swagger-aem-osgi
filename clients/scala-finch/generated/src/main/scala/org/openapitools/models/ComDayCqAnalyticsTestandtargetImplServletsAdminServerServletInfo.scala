package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties]
                )

object ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo] = deriveEncoder
}
