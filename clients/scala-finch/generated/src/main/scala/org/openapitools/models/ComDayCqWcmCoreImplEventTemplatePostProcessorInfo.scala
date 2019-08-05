package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplEventTemplatePostProcessorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplEventTemplatePostProcessorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplEventTemplatePostProcessorProperties]
                )

object ComDayCqWcmCoreImplEventTemplatePostProcessorInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplEventTemplatePostProcessorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplEventTemplatePostProcessorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplEventTemplatePostProcessorInfo] = deriveEncoder
}
