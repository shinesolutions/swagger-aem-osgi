package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties]
                )

object OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo] = deriveEncoder
}
