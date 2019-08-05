package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties]
                )

object OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo] = deriveEncoder
}
