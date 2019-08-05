package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodexpression 
 * @param schedulerPeriodconcurrent 
 */
case class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString],
                schedulerPeriodconcurrent: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties] = deriveEncoder
}
