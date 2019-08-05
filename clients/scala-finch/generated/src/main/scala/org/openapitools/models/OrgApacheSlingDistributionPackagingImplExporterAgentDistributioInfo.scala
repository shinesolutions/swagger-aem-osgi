package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties]
                )

object OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo] = deriveEncoder
}
