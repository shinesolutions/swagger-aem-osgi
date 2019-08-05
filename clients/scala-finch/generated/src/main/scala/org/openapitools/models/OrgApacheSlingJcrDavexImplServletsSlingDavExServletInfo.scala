package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties]
                )

object OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo] = deriveEncoder
}
