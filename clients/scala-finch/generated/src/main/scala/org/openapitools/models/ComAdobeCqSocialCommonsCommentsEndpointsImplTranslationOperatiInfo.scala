package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties]
                )

object ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo] = deriveEncoder
}
