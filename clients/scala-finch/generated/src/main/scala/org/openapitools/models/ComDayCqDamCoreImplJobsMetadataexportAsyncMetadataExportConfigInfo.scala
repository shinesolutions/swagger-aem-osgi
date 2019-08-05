package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties]
                )

object ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo] = deriveEncoder
}
