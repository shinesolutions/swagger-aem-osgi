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
 * @param orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodresourcetype 
 * @param orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodcollectionresourcetype 
 * @param orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodsearchpaths 
 * @param orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodexternalurl 
 * @param orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodenabled 
 */
case class OrgApacheSlingHapiImplHApiUtilImplProperties(orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodresourcetype: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodcollectionresourcetype: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodsearchpaths: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodexternalurl: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingHapiImplHApiUtilImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingHapiImplHApiUtilImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHapiImplHApiUtilImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHapiImplHApiUtilImplProperties] = deriveEncoder
}
