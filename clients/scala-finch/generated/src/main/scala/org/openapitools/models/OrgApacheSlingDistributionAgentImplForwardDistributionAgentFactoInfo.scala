package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties]
                )

object OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo] = deriveEncoder
}
