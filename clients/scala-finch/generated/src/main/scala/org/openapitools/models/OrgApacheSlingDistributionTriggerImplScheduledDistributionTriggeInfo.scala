package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties]
                )

object OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo] = deriveEncoder
}
