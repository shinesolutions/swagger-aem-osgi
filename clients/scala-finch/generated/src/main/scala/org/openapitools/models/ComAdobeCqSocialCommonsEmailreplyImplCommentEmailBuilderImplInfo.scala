package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo] = deriveEncoder
}
