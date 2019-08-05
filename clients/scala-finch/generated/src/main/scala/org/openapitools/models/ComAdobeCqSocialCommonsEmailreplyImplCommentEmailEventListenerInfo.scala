package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo] = deriveEncoder
}
