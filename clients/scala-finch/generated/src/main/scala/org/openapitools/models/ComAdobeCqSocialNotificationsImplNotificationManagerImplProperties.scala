package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param maxPeriodunreadPeriodnotificationPeriodcount 
 */
case class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties(maxPeriodunreadPeriodnotificationPeriodcount: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties] = deriveEncoder
}
