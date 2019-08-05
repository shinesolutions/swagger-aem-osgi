package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties]
                )

object OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo] = deriveEncoder
}
