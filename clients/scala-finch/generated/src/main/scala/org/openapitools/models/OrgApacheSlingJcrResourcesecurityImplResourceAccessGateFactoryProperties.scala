package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 * @param checkpathPeriodprefix 
 * @param jcrPath 
 */
case class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(path: Option[ConfigNodePropertyString],
                checkpathPeriodprefix: Option[ConfigNodePropertyString],
                jcrPath: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties] = deriveEncoder
}
