package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param description 
 * @param overrides 
 * @param enabled 
 * @param servicePeriodranking 
 */
case class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(description: Option[ConfigNodePropertyString],
                overrides: Option[ConfigNodePropertyArray],
                enabled: Option[ConfigNodePropertyBoolean],
                servicePeriodranking: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties] = deriveEncoder
}
