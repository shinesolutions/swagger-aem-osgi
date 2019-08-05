package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties]
                )

object ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo] = deriveEncoder
}
