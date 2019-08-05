package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties]
                )

object OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo] = deriveEncoder
}
