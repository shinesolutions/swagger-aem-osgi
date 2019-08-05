package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreProcessMetadataProcessorProcessProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreProcessMetadataProcessorProcessInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreProcessMetadataProcessorProcessProperties]
                )

object ComDayCqDamCoreProcessMetadataProcessorProcessInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreProcessMetadataProcessorProcessInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreProcessMetadataProcessorProcessInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreProcessMetadataProcessorProcessInfo] = deriveEncoder
}
