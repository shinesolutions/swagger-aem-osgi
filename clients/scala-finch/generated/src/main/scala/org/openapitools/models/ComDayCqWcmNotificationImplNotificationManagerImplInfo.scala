package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmNotificationImplNotificationManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmNotificationImplNotificationManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmNotificationImplNotificationManagerImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmNotificationImplNotificationManagerImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmNotificationImplNotificationManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmNotificationImplNotificationManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmNotificationImplNotificationManagerImplInfo] = deriveEncoder
}
