package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param priorityOrder 
 * @param replyEmailPatterns 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties(priorityOrder: Option[ConfigNodePropertyInteger],
                replyEmailPatterns: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties] = deriveEncoder
}
