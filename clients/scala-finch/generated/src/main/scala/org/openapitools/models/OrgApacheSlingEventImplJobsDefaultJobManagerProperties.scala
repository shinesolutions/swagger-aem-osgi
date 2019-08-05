package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param queuePeriodpriority 
 * @param queuePeriodretries 
 * @param queuePeriodretrydelay 
 * @param queuePeriodmaxparallel 
 */
case class OrgApacheSlingEventImplJobsDefaultJobManagerProperties(queuePeriodpriority: Option[ConfigNodePropertyDropDown],
                queuePeriodretries: Option[ConfigNodePropertyInteger],
                queuePeriodretrydelay: Option[ConfigNodePropertyInteger],
                queuePeriodmaxparallel: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingEventImplJobsDefaultJobManagerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEventImplJobsDefaultJobManagerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEventImplJobsDefaultJobManagerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEventImplJobsDefaultJobManagerProperties] = deriveEncoder
}
