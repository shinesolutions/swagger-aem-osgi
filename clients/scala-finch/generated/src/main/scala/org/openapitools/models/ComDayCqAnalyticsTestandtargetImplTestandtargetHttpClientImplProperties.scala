package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodanalyticsPeriodtestandtargetPeriodapiPeriodurl 
 * @param cqPeriodanalyticsPeriodtestandtargetPeriodtimeout 
 * @param cqPeriodanalyticsPeriodtestandtargetPeriodsockettimeout 
 * @param cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplace 
 * @param cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplacewith 
 */
case class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(cqPeriodanalyticsPeriodtestandtargetPeriodapiPeriodurl: Option[ConfigNodePropertyString],
                cqPeriodanalyticsPeriodtestandtargetPeriodtimeout: Option[ConfigNodePropertyInteger],
                cqPeriodanalyticsPeriodtestandtargetPeriodsockettimeout: Option[ConfigNodePropertyInteger],
                cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplace: Option[ConfigNodePropertyString],
                cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplacewith: Option[ConfigNodePropertyString]
                )

object ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties] = deriveEncoder
}
