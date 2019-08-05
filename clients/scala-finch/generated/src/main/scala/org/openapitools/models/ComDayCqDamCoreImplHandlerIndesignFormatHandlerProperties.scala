package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param mimetype 
 */
case class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties(mimetype: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties] = deriveEncoder
}
