package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties]
                )

object OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo] = deriveEncoder
}
