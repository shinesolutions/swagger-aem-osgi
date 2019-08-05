package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties]
                )

object OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo] = deriveEncoder
}
