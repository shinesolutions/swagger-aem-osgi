package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodexpression 
 */
case class ComDayCqTaggingImplTagGarbageCollectorProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString]
                )

object ComDayCqTaggingImplTagGarbageCollectorProperties {
    /**
     * Creates the codec for converting ComDayCqTaggingImplTagGarbageCollectorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqTaggingImplTagGarbageCollectorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqTaggingImplTagGarbageCollectorProperties] = deriveEncoder
}
