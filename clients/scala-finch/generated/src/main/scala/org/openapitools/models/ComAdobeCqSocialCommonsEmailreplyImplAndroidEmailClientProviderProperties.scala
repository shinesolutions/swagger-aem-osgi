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
case class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties(priorityOrder: Option[ConfigNodePropertyInteger],
                replyEmailPatterns: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties] = deriveEncoder
}
