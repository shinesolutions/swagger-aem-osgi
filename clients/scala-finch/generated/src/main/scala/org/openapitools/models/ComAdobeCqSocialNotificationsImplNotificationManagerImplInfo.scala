package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties]
                )

object ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo] = deriveEncoder
}
