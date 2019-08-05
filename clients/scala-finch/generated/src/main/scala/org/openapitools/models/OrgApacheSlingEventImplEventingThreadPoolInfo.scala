package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEventImplEventingThreadPoolProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingEventImplEventingThreadPoolInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEventImplEventingThreadPoolProperties]
                )

object OrgApacheSlingEventImplEventingThreadPoolInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEventImplEventingThreadPoolInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEventImplEventingThreadPoolInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEventImplEventingThreadPoolInfo] = deriveEncoder
}
