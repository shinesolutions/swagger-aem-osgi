package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param port 
 */
case class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties(port: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties] = deriveEncoder
}
