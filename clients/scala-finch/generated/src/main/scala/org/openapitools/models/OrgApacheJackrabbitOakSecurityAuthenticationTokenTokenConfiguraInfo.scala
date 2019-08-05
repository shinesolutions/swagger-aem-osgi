package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo] = deriveEncoder
}
