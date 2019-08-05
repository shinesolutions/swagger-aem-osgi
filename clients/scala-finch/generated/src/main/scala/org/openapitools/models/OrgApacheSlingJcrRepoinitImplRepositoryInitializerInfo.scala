package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo] = deriveEncoder
}
