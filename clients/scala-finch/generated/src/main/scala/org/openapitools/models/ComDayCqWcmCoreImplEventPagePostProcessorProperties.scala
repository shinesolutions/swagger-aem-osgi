package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param paths 
 */
case class ComDayCqWcmCoreImplEventPagePostProcessorProperties(paths: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmCoreImplEventPagePostProcessorProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplEventPagePostProcessorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplEventPagePostProcessorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplEventPagePostProcessorProperties] = deriveEncoder
}
