package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param enabled 
 * @param configPath 
 * @param fallbackPaths 
 * @param configCollectionInheritancePropertyNames 
 */
case class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(enabled: Option[ConfigNodePropertyBoolean],
                configPath: Option[ConfigNodePropertyString],
                fallbackPaths: Option[ConfigNodePropertyArray],
                configCollectionInheritancePropertyNames: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties] = deriveEncoder
}
