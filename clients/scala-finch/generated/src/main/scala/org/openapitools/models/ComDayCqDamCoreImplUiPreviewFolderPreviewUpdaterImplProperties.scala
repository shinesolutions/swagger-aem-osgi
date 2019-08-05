package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param createPreviewEnabled 
 * @param updatePreviewEnabled 
 * @param queueSize 
 * @param folderPreviewRenditionRegex 
 */
case class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(createPreviewEnabled: Option[ConfigNodePropertyBoolean],
                updatePreviewEnabled: Option[ConfigNodePropertyBoolean],
                queueSize: Option[ConfigNodePropertyInteger],
                folderPreviewRenditionRegex: Option[ConfigNodePropertyString]
                )

object ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties] = deriveEncoder
}
