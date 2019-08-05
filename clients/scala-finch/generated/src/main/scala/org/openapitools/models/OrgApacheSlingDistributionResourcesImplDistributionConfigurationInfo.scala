package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties]
                )

object OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo] = deriveEncoder
}
