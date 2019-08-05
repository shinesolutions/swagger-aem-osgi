package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties]
                )

object ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo] = deriveEncoder
}
