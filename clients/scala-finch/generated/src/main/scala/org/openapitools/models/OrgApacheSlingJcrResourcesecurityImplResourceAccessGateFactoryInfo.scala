package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties]
                )

object OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo] = deriveEncoder
}
