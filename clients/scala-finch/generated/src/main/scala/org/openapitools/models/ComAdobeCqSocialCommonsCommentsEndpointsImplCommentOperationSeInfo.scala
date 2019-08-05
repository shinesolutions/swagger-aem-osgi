package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties]
                )

object ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo] = deriveEncoder
}
