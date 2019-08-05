package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties]
                )

object OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo] = deriveEncoder
}
