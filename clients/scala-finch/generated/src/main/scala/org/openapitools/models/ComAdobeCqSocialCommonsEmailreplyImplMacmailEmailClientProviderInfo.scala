package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo] = deriveEncoder
}
