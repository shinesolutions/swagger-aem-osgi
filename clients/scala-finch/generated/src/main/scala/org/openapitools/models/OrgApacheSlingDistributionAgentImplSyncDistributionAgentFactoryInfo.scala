package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties]
                )

object OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo] = deriveEncoder
}
