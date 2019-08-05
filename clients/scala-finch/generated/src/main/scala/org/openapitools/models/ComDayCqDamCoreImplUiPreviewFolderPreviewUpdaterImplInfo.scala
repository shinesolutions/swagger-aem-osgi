package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties]
                )

object ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo] = deriveEncoder
}
