package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param providerPeriodroots 
 */
case class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties(providerPeriodroots: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingJmxProviderImplJMXResourceProviderProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJmxProviderImplJMXResourceProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJmxProviderImplJMXResourceProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJmxProviderImplJMXResourceProviderProperties] = deriveEncoder
}
