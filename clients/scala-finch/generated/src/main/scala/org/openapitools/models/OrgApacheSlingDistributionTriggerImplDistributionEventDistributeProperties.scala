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
 * @param path 
 */
case class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties(name: Option[ConfigNodePropertyString],
                path: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties] = deriveEncoder
}
