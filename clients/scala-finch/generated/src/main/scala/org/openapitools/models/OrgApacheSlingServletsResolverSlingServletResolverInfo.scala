package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingServletsResolverSlingServletResolverProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingServletsResolverSlingServletResolverInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingServletsResolverSlingServletResolverProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingServletsResolverSlingServletResolverInfo {
    /**
     * Creates the codec for converting OrgApacheSlingServletsResolverSlingServletResolverInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServletsResolverSlingServletResolverInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServletsResolverSlingServletResolverInfo] = deriveEncoder
}
