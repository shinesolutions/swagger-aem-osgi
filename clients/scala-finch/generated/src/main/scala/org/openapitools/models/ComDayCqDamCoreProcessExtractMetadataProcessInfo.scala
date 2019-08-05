package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreProcessExtractMetadataProcessProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreProcessExtractMetadataProcessInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreProcessExtractMetadataProcessProperties]
                )

object ComDayCqDamCoreProcessExtractMetadataProcessInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreProcessExtractMetadataProcessInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreProcessExtractMetadataProcessInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreProcessExtractMetadataProcessInfo] = deriveEncoder
}
