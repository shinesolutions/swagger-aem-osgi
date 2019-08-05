package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties]
                )

object OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo] = deriveEncoder
}
