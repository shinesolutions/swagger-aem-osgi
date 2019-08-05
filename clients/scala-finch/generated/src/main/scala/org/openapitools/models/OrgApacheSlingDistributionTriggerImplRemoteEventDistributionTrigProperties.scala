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
 * @param endpoint 
 * @param transportSecretProviderPeriodtarget 
 */
case class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(name: Option[ConfigNodePropertyString],
                endpoint: Option[ConfigNodePropertyString],
                transportSecretProviderPeriodtarget: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties] = deriveEncoder
}
