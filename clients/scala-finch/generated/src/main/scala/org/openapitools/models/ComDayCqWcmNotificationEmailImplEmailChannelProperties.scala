package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param emailPeriodfrom 
 */
case class ComDayCqWcmNotificationEmailImplEmailChannelProperties(emailPeriodfrom: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmNotificationEmailImplEmailChannelProperties {
    /**
     * Creates the codec for converting ComDayCqWcmNotificationEmailImplEmailChannelProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmNotificationEmailImplEmailChannelProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmNotificationEmailImplEmailChannelProperties] = deriveEncoder
}
