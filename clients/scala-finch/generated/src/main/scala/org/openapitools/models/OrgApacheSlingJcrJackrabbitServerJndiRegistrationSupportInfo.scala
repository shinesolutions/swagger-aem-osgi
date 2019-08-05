package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties]
                )

object OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo] = deriveEncoder
}
