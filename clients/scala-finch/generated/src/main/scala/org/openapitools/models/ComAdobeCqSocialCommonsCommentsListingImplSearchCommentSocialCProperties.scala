package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param numUserLimit 
 */
case class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties(numUserLimit: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties] = deriveEncoder
}
