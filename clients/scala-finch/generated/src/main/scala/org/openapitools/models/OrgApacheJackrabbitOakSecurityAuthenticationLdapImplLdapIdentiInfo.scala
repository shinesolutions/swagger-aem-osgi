package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties]
                )

object OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo] = deriveEncoder
}
