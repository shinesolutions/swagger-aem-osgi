package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param isEnabled 
 */
case class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties(isEnabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties] = deriveEncoder
}
