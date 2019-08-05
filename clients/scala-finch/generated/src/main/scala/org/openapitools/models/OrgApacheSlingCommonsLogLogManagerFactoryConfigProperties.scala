package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnames 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodadditiv 
 */
case class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel: Option[ConfigNodePropertyDropDown],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnames: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodadditiv: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties] = deriveEncoder
}
