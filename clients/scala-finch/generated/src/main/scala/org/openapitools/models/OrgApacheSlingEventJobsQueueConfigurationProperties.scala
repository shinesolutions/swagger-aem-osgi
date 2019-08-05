package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyFloat
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param queuePeriodname 
 * @param queuePeriodtopics 
 * @param queuePeriodtype 
 * @param queuePeriodpriority 
 * @param queuePeriodretries 
 * @param queuePeriodretrydelay 
 * @param queuePeriodmaxparallel 
 * @param queuePeriodkeepJobs 
 * @param queuePeriodpreferRunOnCreationInstance 
 * @param queuePeriodthreadPoolSize 
 * @param servicePeriodranking 
 */
case class OrgApacheSlingEventJobsQueueConfigurationProperties(queuePeriodname: Option[ConfigNodePropertyString],
                queuePeriodtopics: Option[ConfigNodePropertyArray],
                queuePeriodtype: Option[ConfigNodePropertyDropDown],
                queuePeriodpriority: Option[ConfigNodePropertyDropDown],
                queuePeriodretries: Option[ConfigNodePropertyInteger],
                queuePeriodretrydelay: Option[ConfigNodePropertyInteger],
                queuePeriodmaxparallel: Option[ConfigNodePropertyFloat],
                queuePeriodkeepJobs: Option[ConfigNodePropertyBoolean],
                queuePeriodpreferRunOnCreationInstance: Option[ConfigNodePropertyBoolean],
                queuePeriodthreadPoolSize: Option[ConfigNodePropertyInteger],
                servicePeriodranking: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingEventJobsQueueConfigurationProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEventJobsQueueConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEventJobsQueueConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEventJobsQueueConfigurationProperties] = deriveEncoder
}
