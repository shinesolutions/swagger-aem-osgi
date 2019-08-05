package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param dsPeriodloglevel 
 * @param dsPeriodfactoryPeriodenabled 
 * @param dsPerioddelayedPeriodkeepInstances 
 * @param dsPeriodlockPeriodtimeoutPeriodmilliseconds 
 * @param dsPeriodstopPeriodtimeoutPeriodmilliseconds 
 * @param dsPeriodglobalPeriodextender 
 */
case class OrgApacheFelixScrScrServiceProperties(dsPeriodloglevel: Option[ConfigNodePropertyDropDown],
                dsPeriodfactoryPeriodenabled: Option[ConfigNodePropertyBoolean],
                dsPerioddelayedPeriodkeepInstances: Option[ConfigNodePropertyBoolean],
                dsPeriodlockPeriodtimeoutPeriodmilliseconds: Option[ConfigNodePropertyInteger],
                dsPeriodstopPeriodtimeoutPeriodmilliseconds: Option[ConfigNodePropertyInteger],
                dsPeriodglobalPeriodextender: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheFelixScrScrServiceProperties {
    /**
     * Creates the codec for converting OrgApacheFelixScrScrServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixScrScrServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixScrScrServiceProperties] = deriveEncoder
}
