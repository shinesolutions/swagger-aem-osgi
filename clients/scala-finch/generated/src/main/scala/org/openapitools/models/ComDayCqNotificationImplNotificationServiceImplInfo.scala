package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqNotificationImplNotificationServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqNotificationImplNotificationServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqNotificationImplNotificationServiceImplProperties]
                )

object ComDayCqNotificationImplNotificationServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqNotificationImplNotificationServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqNotificationImplNotificationServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqNotificationImplNotificationServiceImplInfo] = deriveEncoder
}
