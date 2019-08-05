package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplEventPagePostProcessorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplEventPagePostProcessorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplEventPagePostProcessorProperties]
                )

object ComDayCqWcmCoreImplEventPagePostProcessorInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplEventPagePostProcessorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplEventPagePostProcessorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplEventPagePostProcessorInfo] = deriveEncoder
}
