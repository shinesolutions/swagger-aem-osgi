package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties]
                )

object OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo] = deriveEncoder
}
