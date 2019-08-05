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
case class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties(providerPeriodroots: Option[ConfigNodePropertyString],
                kind: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties] = deriveEncoder
}
