package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPeriodanalyticsPeriodtestandtargetPeriodsegmentimporterPeriodenabled 
 */
case class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties(cqPeriodanalyticsPeriodtestandtargetPeriodsegmentimporterPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties] = deriveEncoder
}
