package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties]
                )

object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo] = deriveEncoder
}
