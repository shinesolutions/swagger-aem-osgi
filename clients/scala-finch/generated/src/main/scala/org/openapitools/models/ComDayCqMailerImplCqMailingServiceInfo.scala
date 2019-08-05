package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMailerImplCqMailingServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMailerImplCqMailingServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMailerImplCqMailingServiceProperties]
                )

object ComDayCqMailerImplCqMailingServiceInfo {
    /**
     * Creates the codec for converting ComDayCqMailerImplCqMailingServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMailerImplCqMailingServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMailerImplCqMailingServiceInfo] = deriveEncoder
}
