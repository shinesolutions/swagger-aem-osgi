package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param workspace 
 * @param dimensions 
 */
case class ComDayCqWcmCoreImplServletsThumbnailServletProperties(workspace: Option[ConfigNodePropertyString],
                dimensions: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmCoreImplServletsThumbnailServletProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsThumbnailServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsThumbnailServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsThumbnailServletProperties] = deriveEncoder
}
