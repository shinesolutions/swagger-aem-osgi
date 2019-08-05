package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingServletsGetDefaultGetServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingServletsGetDefaultGetServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingServletsGetDefaultGetServletProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingServletsGetDefaultGetServletInfo {
    /**
     * Creates the codec for converting OrgApacheSlingServletsGetDefaultGetServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServletsGetDefaultGetServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServletsGetDefaultGetServletInfo] = deriveEncoder
}
