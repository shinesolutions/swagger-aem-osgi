package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodtopics 
 * @param eventPeriodfilter 
 */
case class ComAdobeCqSocialNotificationsImplNotificationsRouterProperties(eventPeriodtopics: Option[ConfigNodePropertyString],
                eventPeriodfilter: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialNotificationsImplNotificationsRouterProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialNotificationsImplNotificationsRouterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialNotificationsImplNotificationsRouterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialNotificationsImplNotificationsRouterProperties] = deriveEncoder
}
