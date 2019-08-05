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
 * @param path 
 * @param seconds 
 * @param serviceName 
 */
case class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(name: Option[ConfigNodePropertyString],
                path: Option[ConfigNodePropertyString],
                seconds: Option[ConfigNodePropertyString],
                serviceName: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties] = deriveEncoder
}
