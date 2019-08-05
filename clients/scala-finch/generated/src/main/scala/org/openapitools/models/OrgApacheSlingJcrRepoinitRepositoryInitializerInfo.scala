package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrRepoinitRepositoryInitializerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrRepoinitRepositoryInitializerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrRepoinitRepositoryInitializerProperties]
                )

object OrgApacheSlingJcrRepoinitRepositoryInitializerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrRepoinitRepositoryInitializerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrRepoinitRepositoryInitializerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrRepoinitRepositoryInitializerInfo] = deriveEncoder
}
