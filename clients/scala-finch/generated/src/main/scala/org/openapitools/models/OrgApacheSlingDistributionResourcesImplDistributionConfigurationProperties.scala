package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param providerPeriodroots 
 * @param kind 
 */
case class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties(providerPeriodroots: Option[ConfigNodePropertyString],
                kind: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties] = deriveEncoder
}
