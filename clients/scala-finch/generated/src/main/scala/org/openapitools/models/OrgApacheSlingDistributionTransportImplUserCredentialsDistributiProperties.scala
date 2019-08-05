package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param username 
 * @param password 
 */
case class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties(name: Option[ConfigNodePropertyString],
                username: Option[ConfigNodePropertyString],
                password: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties] = deriveEncoder
}
