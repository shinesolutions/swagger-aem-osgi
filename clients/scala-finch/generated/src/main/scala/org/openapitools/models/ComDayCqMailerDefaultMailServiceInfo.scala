package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMailerDefaultMailServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMailerDefaultMailServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMailerDefaultMailServiceProperties]
                )

object ComDayCqMailerDefaultMailServiceInfo {
    /**
     * Creates the codec for converting ComDayCqMailerDefaultMailServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMailerDefaultMailServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMailerDefaultMailServiceInfo] = deriveEncoder
}
