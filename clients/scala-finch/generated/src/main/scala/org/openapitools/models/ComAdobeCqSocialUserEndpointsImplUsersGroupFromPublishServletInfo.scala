package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties]
                )

object ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo] = deriveEncoder
}
