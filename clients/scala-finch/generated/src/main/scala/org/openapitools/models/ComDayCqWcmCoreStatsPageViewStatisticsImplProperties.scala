package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param pageviewstatisticsPeriodtrackingurl 
 * @param pageviewstatisticsPeriodtrackingscriptPeriodenabled 
 */
case class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(pageviewstatisticsPeriodtrackingurl: Option[ConfigNodePropertyString],
                pageviewstatisticsPeriodtrackingscriptPeriodenabled: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreStatsPageViewStatisticsImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreStatsPageViewStatisticsImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreStatsPageViewStatisticsImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreStatsPageViewStatisticsImplProperties] = deriveEncoder
}
