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
case class ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties(priorityOrder: Option[ConfigNodePropertyInteger],
                replyEmailPatterns: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties] = deriveEncoder
}
