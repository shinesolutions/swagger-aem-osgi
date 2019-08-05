package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCommonsHttpclientProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCommonsHttpclientInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCommonsHttpclientProperties]
                )

object ComDayCommonsHttpclientInfo {
    /**
     * Creates the codec for converting ComDayCommonsHttpclientInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCommonsHttpclientInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCommonsHttpclientInfo] = deriveEncoder
}
