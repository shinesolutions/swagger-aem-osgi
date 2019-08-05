package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param xmphandlerPeriodcqPeriodformats 
 */
case class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties(xmphandlerPeriodcqPeriodformats: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties] = deriveEncoder
}
