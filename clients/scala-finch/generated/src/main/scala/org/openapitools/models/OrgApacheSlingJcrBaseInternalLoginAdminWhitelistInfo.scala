package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties]
                )

object OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo] = deriveEncoder
}
