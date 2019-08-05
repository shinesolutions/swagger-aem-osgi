package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties]
                )

object OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo] = deriveEncoder
}
