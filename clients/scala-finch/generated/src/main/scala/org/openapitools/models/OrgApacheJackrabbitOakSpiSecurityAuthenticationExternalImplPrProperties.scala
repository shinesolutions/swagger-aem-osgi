package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param protectExternalId 
 */
case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties(protectExternalId: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties] = deriveEncoder
}
