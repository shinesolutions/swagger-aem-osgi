package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param maxPeriodquartzJobPerioddurationPeriodacceptable 
 */
case class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(maxPeriodquartzJobPerioddurationPeriodacceptable: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties] = deriveEncoder
}
