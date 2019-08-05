package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param enabled 
 * @param servicePeriodranking 
 */
case class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(enabled: Option[ConfigNodePropertyBoolean],
                servicePeriodranking: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties] = deriveEncoder
}
