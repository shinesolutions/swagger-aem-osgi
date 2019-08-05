package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJmxProviderImplJMXResourceProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJmxProviderImplJMXResourceProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJmxProviderImplJMXResourceProviderProperties]
                )

object OrgApacheSlingJmxProviderImplJMXResourceProviderInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJmxProviderImplJMXResourceProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJmxProviderImplJMXResourceProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJmxProviderImplJMXResourceProviderInfo] = deriveEncoder
}
