package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enabled 
 */
case class OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties(enabled: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties] = deriveEncoder
}
