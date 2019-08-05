package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties]
                )

object ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo] = deriveEncoder
}
