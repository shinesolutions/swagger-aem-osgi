package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param poolName 
 * @param allowedPoolNames 
 * @param schedulerPerioduseleaderforsingle 
 * @param metricsPeriodfilters 
 * @param slowThresholdMillis 
 */
case class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(poolName: Option[ConfigNodePropertyString],
                allowedPoolNames: Option[ConfigNodePropertyArray],
                schedulerPerioduseleaderforsingle: Option[ConfigNodePropertyBoolean],
                metricsPeriodfilters: Option[ConfigNodePropertyArray],
                slowThresholdMillis: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties] = deriveEncoder
}
