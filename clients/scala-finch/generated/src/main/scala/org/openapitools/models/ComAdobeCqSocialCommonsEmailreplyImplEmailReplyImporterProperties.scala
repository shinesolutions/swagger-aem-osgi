package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param connectProtocol 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties(connectProtocol: Option[ConfigNodePropertyDropDown]
                )

object ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties] = deriveEncoder
}
