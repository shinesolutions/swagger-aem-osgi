package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo] = deriveEncoder
}
