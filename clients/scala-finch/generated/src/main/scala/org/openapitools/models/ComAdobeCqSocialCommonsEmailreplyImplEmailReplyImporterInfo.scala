package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo] = deriveEncoder
}
