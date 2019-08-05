package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplExpiryNotificationJobImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplExpiryNotificationJobImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplExpiryNotificationJobImplProperties]
                )

object ComDayCqDamCoreImplExpiryNotificationJobImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplExpiryNotificationJobImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplExpiryNotificationJobImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplExpiryNotificationJobImplInfo] = deriveEncoder
}
