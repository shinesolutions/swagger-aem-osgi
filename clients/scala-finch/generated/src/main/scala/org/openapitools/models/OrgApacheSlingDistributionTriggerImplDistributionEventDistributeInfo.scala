package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties]
                )

object OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo] = deriveEncoder
}
