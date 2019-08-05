package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties]
                )

object OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo] = deriveEncoder
}
