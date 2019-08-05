package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodbuffered 
 */
case class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodbuffered: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties] = deriveEncoder
}
