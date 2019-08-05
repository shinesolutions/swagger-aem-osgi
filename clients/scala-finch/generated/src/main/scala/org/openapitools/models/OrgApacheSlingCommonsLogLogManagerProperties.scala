package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodconfigurationFile 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpackagingDataEnabled 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxCallerDataDepth 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxOldFileCountInDump 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnumOfLines 
 */
case class OrgApacheSlingCommonsLogLogManagerProperties(orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel: Option[ConfigNodePropertyDropDown],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodconfigurationFile: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpackagingDataEnabled: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxCallerDataDepth: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxOldFileCountInDump: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnumOfLines: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingCommonsLogLogManagerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsLogLogManagerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsLogLogManagerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsLogLogManagerProperties] = deriveEncoder
}
