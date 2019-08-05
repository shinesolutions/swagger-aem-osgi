package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties]
                )

object OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo] = deriveEncoder
}
