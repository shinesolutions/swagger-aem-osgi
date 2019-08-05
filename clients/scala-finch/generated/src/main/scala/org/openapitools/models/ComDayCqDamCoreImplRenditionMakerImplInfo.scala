package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplRenditionMakerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplRenditionMakerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplRenditionMakerImplProperties]
                )

object ComDayCqDamCoreImplRenditionMakerImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplRenditionMakerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplRenditionMakerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplRenditionMakerImplInfo] = deriveEncoder
}
