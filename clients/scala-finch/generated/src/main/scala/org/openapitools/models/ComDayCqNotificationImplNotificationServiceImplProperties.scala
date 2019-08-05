package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodfilter 
 */
case class ComDayCqNotificationImplNotificationServiceImplProperties(eventPeriodfilter: Option[ConfigNodePropertyString]
                )

object ComDayCqNotificationImplNotificationServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqNotificationImplNotificationServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqNotificationImplNotificationServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqNotificationImplNotificationServiceImplProperties] = deriveEncoder
}
