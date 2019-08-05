package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties]
                )

object ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo] = deriveEncoder
}
