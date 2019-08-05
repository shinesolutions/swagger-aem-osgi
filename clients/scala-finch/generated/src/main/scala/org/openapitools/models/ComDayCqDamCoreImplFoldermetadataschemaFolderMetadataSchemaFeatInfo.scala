package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties]
                )

object ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo] = deriveEncoder
}
