package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist 
 * @param mode 
 * @param port 
 * @param primaryPeriodhost 
 * @param interval 
 * @param primaryPeriodallowedMinusclientMinusipMinusranges 
 * @param secure 
 * @param standbyPeriodreadtimeout 
 * @param standbyPeriodautoclean 
 */
case class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist: Option[ConfigNodePropertyBoolean],
                mode: Option[ConfigNodePropertyDropDown],
                port: Option[ConfigNodePropertyInteger],
                primaryPeriodhost: Option[ConfigNodePropertyString],
                interval: Option[ConfigNodePropertyInteger],
                primaryPeriodallowedMinusclientMinusipMinusranges: Option[ConfigNodePropertyArray],
                secure: Option[ConfigNodePropertyBoolean],
                standbyPeriodreadtimeout: Option[ConfigNodePropertyInteger],
                standbyPeriodautoclean: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties] = deriveEncoder
}
