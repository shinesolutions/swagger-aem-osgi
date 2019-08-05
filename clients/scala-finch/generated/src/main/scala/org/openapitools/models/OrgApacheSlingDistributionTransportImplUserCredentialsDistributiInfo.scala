package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties]
                )

object OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo] = deriveEncoder
}
