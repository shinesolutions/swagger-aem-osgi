package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCommonsHandlerStandardImageHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCommonsHandlerStandardImageHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCommonsHandlerStandardImageHandlerProperties]
                )

object ComDayCqDamCommonsHandlerStandardImageHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamCommonsHandlerStandardImageHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCommonsHandlerStandardImageHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCommonsHandlerStandardImageHandlerInfo] = deriveEncoder
}
