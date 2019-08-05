package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqTaggingImplTagGarbageCollectorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqTaggingImplTagGarbageCollectorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqTaggingImplTagGarbageCollectorProperties]
                )

object ComDayCqTaggingImplTagGarbageCollectorInfo {
    /**
     * Creates the codec for converting ComDayCqTaggingImplTagGarbageCollectorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqTaggingImplTagGarbageCollectorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqTaggingImplTagGarbageCollectorInfo] = deriveEncoder
}
