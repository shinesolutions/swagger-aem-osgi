package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties]
                )

object OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo] = deriveEncoder
}
