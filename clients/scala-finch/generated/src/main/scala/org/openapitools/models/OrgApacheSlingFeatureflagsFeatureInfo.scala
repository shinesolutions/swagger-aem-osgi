package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingFeatureflagsFeatureProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingFeatureflagsFeatureInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingFeatureflagsFeatureProperties]
                )

object OrgApacheSlingFeatureflagsFeatureInfo {
    /**
     * Creates the codec for converting OrgApacheSlingFeatureflagsFeatureInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingFeatureflagsFeatureInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingFeatureflagsFeatureInfo] = deriveEncoder
}
