package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmNotificationEmailImplEmailChannelProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmNotificationEmailImplEmailChannelInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmNotificationEmailImplEmailChannelProperties]
                )

object ComDayCqWcmNotificationEmailImplEmailChannelInfo {
    /**
     * Creates the codec for converting ComDayCqWcmNotificationEmailImplEmailChannelInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmNotificationEmailImplEmailChannelInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmNotificationEmailImplEmailChannelInfo] = deriveEncoder
}
