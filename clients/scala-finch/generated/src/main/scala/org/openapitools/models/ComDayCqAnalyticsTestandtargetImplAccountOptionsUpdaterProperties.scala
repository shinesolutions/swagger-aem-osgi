package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPeriodanalyticsPeriodtestandtargetPeriodaccountoptionsupdaterPeriodenabled 
 */
case class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties(cqPeriodanalyticsPeriodtestandtargetPeriodaccountoptionsupdaterPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties] = deriveEncoder
}
