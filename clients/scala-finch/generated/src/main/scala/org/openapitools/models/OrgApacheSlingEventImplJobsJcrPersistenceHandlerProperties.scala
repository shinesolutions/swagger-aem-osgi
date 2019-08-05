package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param jobPeriodconsumermanagerPerioddisableDistribution 
 * @param startupPerioddelay 
 * @param cleanupPeriodperiod 
 */
case class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(jobPeriodconsumermanagerPerioddisableDistribution: Option[ConfigNodePropertyBoolean],
                startupPerioddelay: Option[ConfigNodePropertyInteger],
                cleanupPeriodperiod: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties] = deriveEncoder
}
