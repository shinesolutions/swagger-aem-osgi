package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplHandlerJpegHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplHandlerJpegHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplHandlerJpegHandlerProperties]
                )

object ComDayCqDamCoreImplHandlerJpegHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplHandlerJpegHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplHandlerJpegHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplHandlerJpegHandlerInfo] = deriveEncoder
}
