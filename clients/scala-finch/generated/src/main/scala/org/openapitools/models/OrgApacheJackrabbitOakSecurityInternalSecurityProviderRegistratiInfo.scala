package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo] = deriveEncoder
}
