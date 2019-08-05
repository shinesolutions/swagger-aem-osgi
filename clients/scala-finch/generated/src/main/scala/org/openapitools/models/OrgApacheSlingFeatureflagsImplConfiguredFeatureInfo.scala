package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties]
                )

object OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo {
    /**
     * Creates the codec for converting OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo] = deriveEncoder
}
