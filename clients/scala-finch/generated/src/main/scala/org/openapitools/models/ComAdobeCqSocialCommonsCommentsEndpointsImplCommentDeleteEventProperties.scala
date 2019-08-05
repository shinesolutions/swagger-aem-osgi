package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param ranking 
 */
case class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties(ranking: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties] = deriveEncoder
}
