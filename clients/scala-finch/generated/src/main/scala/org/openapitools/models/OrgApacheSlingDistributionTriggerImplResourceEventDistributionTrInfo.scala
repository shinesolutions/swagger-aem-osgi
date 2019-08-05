package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties]
                )

object OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo] = deriveEncoder
}
