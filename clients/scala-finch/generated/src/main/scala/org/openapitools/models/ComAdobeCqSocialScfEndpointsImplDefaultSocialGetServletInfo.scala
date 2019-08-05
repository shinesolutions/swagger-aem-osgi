package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties]
                )

object ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo] = deriveEncoder
}
