package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param jcrPrivilege 
 */
case class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(name: Option[ConfigNodePropertyString],
                jcrPrivilege: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties] = deriveEncoder
}
