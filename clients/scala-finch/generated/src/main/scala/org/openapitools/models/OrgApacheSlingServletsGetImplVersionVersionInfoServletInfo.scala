package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties]
                )

object OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo {
    /**
     * Creates the codec for converting OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo] = deriveEncoder
}
