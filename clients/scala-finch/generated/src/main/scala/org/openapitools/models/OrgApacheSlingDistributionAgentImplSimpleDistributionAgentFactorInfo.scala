package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties]
                )

object OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo] = deriveEncoder
}
