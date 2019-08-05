package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param paths 
 */
case class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties(paths: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreImplEventTemplatePostProcessorProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplEventTemplatePostProcessorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplEventTemplatePostProcessorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplEventTemplatePostProcessorProperties] = deriveEncoder
}
