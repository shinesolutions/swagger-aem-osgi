package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialNotificationsImplMentionsRouterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialNotificationsImplMentionsRouterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialNotificationsImplMentionsRouterProperties]
                )

object ComAdobeCqSocialNotificationsImplMentionsRouterInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialNotificationsImplMentionsRouterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialNotificationsImplMentionsRouterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialNotificationsImplMentionsRouterInfo] = deriveEncoder
}
