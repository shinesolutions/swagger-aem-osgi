package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties]
                )

object OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo] = deriveEncoder
}
