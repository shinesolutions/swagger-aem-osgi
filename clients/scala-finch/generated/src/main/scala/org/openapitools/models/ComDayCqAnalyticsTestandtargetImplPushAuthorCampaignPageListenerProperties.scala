package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPeriodanalyticsPeriodtestandtargetPeriodpushauthorcampaignpagelistenerPeriodenabled 
 */
case class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties(cqPeriodanalyticsPeriodtestandtargetPeriodpushauthorcampaignpagelistenerPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties] = deriveEncoder
}
