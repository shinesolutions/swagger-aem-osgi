package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties]
                )

object ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo] = deriveEncoder
}
