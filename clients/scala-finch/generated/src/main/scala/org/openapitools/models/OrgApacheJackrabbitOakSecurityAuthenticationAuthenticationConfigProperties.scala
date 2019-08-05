package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodappName 
 * @param orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodconfigSpiName 
 */
case class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodappName: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodconfigSpiName: Option[ConfigNodePropertyString]
                )

object OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties] = deriveEncoder
}
