package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param queue 
 * @param dropPeriodinvalidPerioditems 
 * @param agentPeriodtarget 
 */
case class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(name: Option[ConfigNodePropertyString],
                queue: Option[ConfigNodePropertyString],
                dropPeriodinvalidPerioditems: Option[ConfigNodePropertyBoolean],
                agentPeriodtarget: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties] = deriveEncoder
}
