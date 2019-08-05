package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param maxPeriodrecursionPeriodlevels 
 */
case class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties(maxPeriodrecursionPeriodlevels: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties {
    /**
     * Creates the codec for converting OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties] = deriveEncoder
}
