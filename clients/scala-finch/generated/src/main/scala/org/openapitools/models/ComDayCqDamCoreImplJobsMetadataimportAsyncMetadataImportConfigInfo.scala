package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties]
                )

object ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo] = deriveEncoder
}
