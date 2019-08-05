package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEventJobsQueueConfigurationProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingEventJobsQueueConfigurationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEventJobsQueueConfigurationProperties]
                )

object OrgApacheSlingEventJobsQueueConfigurationInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEventJobsQueueConfigurationInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEventJobsQueueConfigurationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEventJobsQueueConfigurationInfo] = deriveEncoder
}
