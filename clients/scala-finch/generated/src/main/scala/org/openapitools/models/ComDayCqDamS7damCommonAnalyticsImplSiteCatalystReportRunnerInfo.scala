package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties]
                )

object ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo] = deriveEncoder
}
