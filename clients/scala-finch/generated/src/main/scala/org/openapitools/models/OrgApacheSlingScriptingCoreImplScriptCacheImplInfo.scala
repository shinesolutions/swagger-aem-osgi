package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingScriptingCoreImplScriptCacheImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingScriptingCoreImplScriptCacheImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingScriptingCoreImplScriptCacheImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingScriptingCoreImplScriptCacheImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingCoreImplScriptCacheImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingCoreImplScriptCacheImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingCoreImplScriptCacheImplInfo] = deriveEncoder
}
