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
case class OrgApacheSlingFeatureflagsFeatureProperties(name: Option[ConfigNodePropertyString],
                description: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingFeatureflagsFeatureProperties {
    /**
     * Creates the codec for converting OrgApacheSlingFeatureflagsFeatureProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingFeatureflagsFeatureProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingFeatureflagsFeatureProperties] = deriveEncoder
}
