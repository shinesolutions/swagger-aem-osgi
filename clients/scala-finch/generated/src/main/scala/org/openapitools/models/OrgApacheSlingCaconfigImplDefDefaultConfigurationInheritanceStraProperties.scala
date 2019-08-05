package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enabled 
 * @param configPropertyInheritancePropertyNames 
 */
case class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties(enabled: Option[ConfigNodePropertyBoolean],
                configPropertyInheritancePropertyNames: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties] = deriveEncoder
}
