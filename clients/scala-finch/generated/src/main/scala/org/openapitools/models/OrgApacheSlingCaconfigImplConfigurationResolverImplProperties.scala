package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param configBucketNames 
 */
case class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties(configBucketNames: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingCaconfigImplConfigurationResolverImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplConfigurationResolverImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplConfigurationResolverImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplConfigurationResolverImplProperties] = deriveEncoder
}
