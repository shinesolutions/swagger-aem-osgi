package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param aemPeriodmcmPeriodcampaignPeriodformConstraints 
 * @param aemPeriodmcmPeriodcampaignPeriodpublicUrl 
 * @param aemPeriodmcmPeriodcampaignPeriodrelaxedSSL 
 */
case class ComDayCqMcmCampaignImplIntegrationConfigImplProperties(aemPeriodmcmPeriodcampaignPeriodformConstraints: Option[ConfigNodePropertyArray],
                aemPeriodmcmPeriodcampaignPeriodpublicUrl: Option[ConfigNodePropertyString],
                aemPeriodmcmPeriodcampaignPeriodrelaxedSSL: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqMcmCampaignImplIntegrationConfigImplProperties {
    /**
     * Creates the codec for converting ComDayCqMcmCampaignImplIntegrationConfigImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmCampaignImplIntegrationConfigImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmCampaignImplIntegrationConfigImplProperties] = deriveEncoder
}
