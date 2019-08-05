package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist 
 * @param jobPeriodconsumermanagerPeriodwhitelist 
 * @param jobPeriodconsumermanagerPeriodblacklist 
 */
case class OrgApacheSlingEventImplJobsJobConsumerManagerProperties(orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist: Option[ConfigNodePropertyBoolean],
                jobPeriodconsumermanagerPeriodwhitelist: Option[ConfigNodePropertyArray],
                jobPeriodconsumermanagerPeriodblacklist: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingEventImplJobsJobConsumerManagerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEventImplJobsJobConsumerManagerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEventImplJobsJobConsumerManagerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEventImplJobsJobConsumerManagerProperties] = deriveEncoder
}
