package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param graniteColondata 
 */
case class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties(graniteColondata: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties] = deriveEncoder
}
