package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPeriodanalyticsPeriodtestandtargetPerioddeleteauthoractivitylistenerPeriodenabled 
 */
case class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties(cqPeriodanalyticsPeriodtestandtargetPerioddeleteauthoractivitylistenerPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties] = deriveEncoder
}
