package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo] = deriveEncoder
}
