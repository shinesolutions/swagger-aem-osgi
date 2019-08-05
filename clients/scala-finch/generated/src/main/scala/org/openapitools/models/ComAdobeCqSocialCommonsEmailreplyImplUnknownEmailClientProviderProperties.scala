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
 * @param replyEmailPatterns 
 * @param priorityOrder 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties(replyEmailPatterns: Option[ConfigNodePropertyArray],
                priorityOrder: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties] = deriveEncoder
}
