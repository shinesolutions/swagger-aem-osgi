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
case class ComAdobeCqSocialNotificationsImplMentionsRouterProperties(eventPeriodtopics: Option[ConfigNodePropertyString],
                eventPeriodfilter: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialNotificationsImplMentionsRouterProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialNotificationsImplMentionsRouterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialNotificationsImplMentionsRouterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialNotificationsImplMentionsRouterProperties] = deriveEncoder
}
