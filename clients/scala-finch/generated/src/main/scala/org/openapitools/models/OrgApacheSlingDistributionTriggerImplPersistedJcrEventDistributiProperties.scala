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
 * @param serviceName 
 * @param nuggetsPath 
 */
case class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties(name: Option[ConfigNodePropertyString],
                path: Option[ConfigNodePropertyString],
                serviceName: Option[ConfigNodePropertyString],
                nuggetsPath: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties] = deriveEncoder
}
