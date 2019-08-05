package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param mimetype 
 */
case class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties(mimetype: Option[ConfigNodePropertyString]
                )

object ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties] = deriveEncoder
}
