package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo] = deriveEncoder
}
