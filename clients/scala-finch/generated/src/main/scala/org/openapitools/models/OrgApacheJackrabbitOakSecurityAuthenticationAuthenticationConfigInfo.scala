package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties]
                )

object OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo] = deriveEncoder
}
