package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param filterPeriodorder 
 * @param filterPeriodscope 
 */
case class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties(filterPeriodorder: Option[ConfigNodePropertyString],
                filterPeriodscope: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplWarpTimeWarpFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties] = deriveEncoder
}
