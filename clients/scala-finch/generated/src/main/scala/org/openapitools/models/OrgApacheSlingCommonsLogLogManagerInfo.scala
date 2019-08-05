package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsLogLogManagerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingCommonsLogLogManagerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsLogLogManagerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingCommonsLogLogManagerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsLogLogManagerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsLogLogManagerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsLogLogManagerInfo] = deriveEncoder
}
