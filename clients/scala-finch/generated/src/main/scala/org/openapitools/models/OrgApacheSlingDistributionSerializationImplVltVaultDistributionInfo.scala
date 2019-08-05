package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties]
                )

object OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo] = deriveEncoder
}
