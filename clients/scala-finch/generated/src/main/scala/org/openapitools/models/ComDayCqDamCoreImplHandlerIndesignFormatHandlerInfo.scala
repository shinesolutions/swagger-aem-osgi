package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties]
                )

object ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo] = deriveEncoder
}
