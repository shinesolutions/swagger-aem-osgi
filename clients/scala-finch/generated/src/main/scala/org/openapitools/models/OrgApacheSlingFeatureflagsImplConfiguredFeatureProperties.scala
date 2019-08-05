package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param description 
 * @param enabled 
 */
case class OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties(name: Option[ConfigNodePropertyString],
                description: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties {
    /**
     * Creates the codec for converting OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties] = deriveEncoder
}
