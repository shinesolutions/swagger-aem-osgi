package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param eventPeriodtopics 
 */
case class ComDayCqWcmNotificationImplNotificationManagerImplProperties(eventPeriodtopics: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmNotificationImplNotificationManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmNotificationImplNotificationManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmNotificationImplNotificationManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmNotificationImplNotificationManagerImplProperties] = deriveEncoder
}
