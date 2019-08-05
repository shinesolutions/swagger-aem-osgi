package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo] = deriveEncoder
}
