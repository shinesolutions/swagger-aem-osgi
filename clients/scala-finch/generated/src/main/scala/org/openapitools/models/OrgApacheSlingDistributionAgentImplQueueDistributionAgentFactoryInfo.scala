package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties]
                )

object OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo] = deriveEncoder
}
