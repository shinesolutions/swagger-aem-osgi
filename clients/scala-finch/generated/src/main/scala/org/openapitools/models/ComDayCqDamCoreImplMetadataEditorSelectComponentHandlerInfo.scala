package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties]
                )

object ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo] = deriveEncoder
}
