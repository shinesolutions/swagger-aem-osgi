package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param enabled 
 * @param configRefResourceNames 
 * @param configRefPropertyNames 
 * @param servicePeriodranking 
 */
case class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(enabled: Option[ConfigNodePropertyBoolean],
                configRefResourceNames: Option[ConfigNodePropertyArray],
                configRefPropertyNames: Option[ConfigNodePropertyArray],
                servicePeriodranking: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties] = deriveEncoder
}
