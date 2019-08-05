package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param jaasPeriodranking 
 * @param jaasPeriodcontrolFlag 
 * @param jaasPeriodrealmName 
 * @param idpPeriodname 
 * @param syncPeriodhandlerName 
 */
case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(jaasPeriodranking: Option[ConfigNodePropertyInteger],
                jaasPeriodcontrolFlag: Option[ConfigNodePropertyString],
                jaasPeriodrealmName: Option[ConfigNodePropertyString],
                idpPeriodname: Option[ConfigNodePropertyString],
                syncPeriodhandlerName: Option[ConfigNodePropertyString]
                )

object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties] = deriveEncoder
}
