package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties]
                )

object OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo] = deriveEncoder
}
