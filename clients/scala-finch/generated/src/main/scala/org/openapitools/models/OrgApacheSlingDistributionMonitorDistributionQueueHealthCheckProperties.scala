package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param hcPeriodname 
 * @param hcPeriodtags 
 * @param hcPeriodmbeanPeriodname 
 * @param numberOfRetriesAllowed 
 */
case class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties(hcPeriodname: Option[ConfigNodePropertyString],
                hcPeriodtags: Option[ConfigNodePropertyArray],
                hcPeriodmbeanPeriodname: Option[ConfigNodePropertyString],
                numberOfRetriesAllowed: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties] = deriveEncoder
}
