package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties]
                )

object OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo] = deriveEncoder
}
