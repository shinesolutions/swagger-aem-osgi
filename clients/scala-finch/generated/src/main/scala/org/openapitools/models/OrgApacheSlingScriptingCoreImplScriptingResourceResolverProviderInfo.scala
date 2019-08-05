package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties]
                )

object OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo] = deriveEncoder
}
