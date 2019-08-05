package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqTaggingImplJcrTagManagerFactoryImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqTaggingImplJcrTagManagerFactoryImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqTaggingImplJcrTagManagerFactoryImplProperties]
                )

object ComDayCqTaggingImplJcrTagManagerFactoryImplInfo {
    /**
     * Creates the codec for converting ComDayCqTaggingImplJcrTagManagerFactoryImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqTaggingImplJcrTagManagerFactoryImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqTaggingImplJcrTagManagerFactoryImplInfo] = deriveEncoder
}
