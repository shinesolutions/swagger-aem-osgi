package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingAuthCoreImplLogoutServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingAuthCoreImplLogoutServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingAuthCoreImplLogoutServletProperties]
                )

object OrgApacheSlingAuthCoreImplLogoutServletInfo {
    /**
     * Creates the codec for converting OrgApacheSlingAuthCoreImplLogoutServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingAuthCoreImplLogoutServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingAuthCoreImplLogoutServletInfo] = deriveEncoder
}
