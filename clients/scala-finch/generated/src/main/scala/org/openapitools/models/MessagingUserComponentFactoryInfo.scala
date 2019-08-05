package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessagingUserComponentFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class MessagingUserComponentFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[MessagingUserComponentFactoryProperties]
                )

object MessagingUserComponentFactoryInfo {
    /**
     * Creates the codec for converting MessagingUserComponentFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[MessagingUserComponentFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessagingUserComponentFactoryInfo] = deriveEncoder
}
