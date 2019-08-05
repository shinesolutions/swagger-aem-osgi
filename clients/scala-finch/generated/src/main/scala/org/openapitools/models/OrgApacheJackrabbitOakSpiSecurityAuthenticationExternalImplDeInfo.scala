package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties]
                )

object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo] = deriveEncoder
}
