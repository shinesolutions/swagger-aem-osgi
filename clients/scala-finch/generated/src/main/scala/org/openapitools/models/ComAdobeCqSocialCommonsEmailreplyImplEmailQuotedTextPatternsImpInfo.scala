package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo] = deriveEncoder
}
