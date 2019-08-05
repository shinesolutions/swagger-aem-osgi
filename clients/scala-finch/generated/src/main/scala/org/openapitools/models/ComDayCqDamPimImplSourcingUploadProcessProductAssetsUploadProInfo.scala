package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties]
                )

object ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo {
    /**
     * Creates the codec for converting ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo] = deriveEncoder
}
