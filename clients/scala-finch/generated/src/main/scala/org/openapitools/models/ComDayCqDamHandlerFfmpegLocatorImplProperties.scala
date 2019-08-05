package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param executablePeriodsearchpath 
 */
case class ComDayCqDamHandlerFfmpegLocatorImplProperties(executablePeriodsearchpath: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamHandlerFfmpegLocatorImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamHandlerFfmpegLocatorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamHandlerFfmpegLocatorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamHandlerFfmpegLocatorImplProperties] = deriveEncoder
}
