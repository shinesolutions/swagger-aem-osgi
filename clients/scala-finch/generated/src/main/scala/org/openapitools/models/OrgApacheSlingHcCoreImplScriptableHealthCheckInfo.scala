package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingHcCoreImplScriptableHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingHcCoreImplScriptableHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingHcCoreImplScriptableHealthCheckProperties]
                )

object OrgApacheSlingHcCoreImplScriptableHealthCheckInfo {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplScriptableHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplScriptableHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplScriptableHealthCheckInfo] = deriveEncoder
}
