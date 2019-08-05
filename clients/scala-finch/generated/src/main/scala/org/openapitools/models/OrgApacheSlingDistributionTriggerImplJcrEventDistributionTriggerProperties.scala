package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param path 
 * @param ignoredPathsPatterns 
 * @param serviceName 
 * @param deep 
 */
case class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(name: Option[ConfigNodePropertyString],
                path: Option[ConfigNodePropertyString],
                ignoredPathsPatterns: Option[ConfigNodePropertyArray],
                serviceName: Option[ConfigNodePropertyString],
                deep: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties] = deriveEncoder
}
