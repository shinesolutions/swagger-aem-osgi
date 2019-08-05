package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties]
                )

object ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo] = deriveEncoder
}
