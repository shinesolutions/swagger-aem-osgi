package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties]
                )

object ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo] = deriveEncoder
}
