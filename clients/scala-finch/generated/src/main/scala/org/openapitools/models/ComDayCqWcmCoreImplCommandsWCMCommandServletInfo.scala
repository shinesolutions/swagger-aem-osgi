package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplCommandsWCMCommandServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplCommandsWCMCommandServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplCommandsWCMCommandServletProperties]
                )

object ComDayCqWcmCoreImplCommandsWCMCommandServletInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplCommandsWCMCommandServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplCommandsWCMCommandServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplCommandsWCMCommandServletInfo] = deriveEncoder
}
