package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplServletBatchMetadataServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplServletBatchMetadataServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplServletBatchMetadataServletProperties]
                )

object ComDayCqDamCoreImplServletBatchMetadataServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletBatchMetadataServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletBatchMetadataServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletBatchMetadataServletInfo] = deriveEncoder
}
