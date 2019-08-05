package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param contextPeriodpath 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties(contextPeriodpath: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties] = deriveEncoder
}
