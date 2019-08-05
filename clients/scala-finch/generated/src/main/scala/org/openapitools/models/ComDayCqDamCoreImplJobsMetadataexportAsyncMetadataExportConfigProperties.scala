package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param operation 
 * @param emailEnabled 
 */
case class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(operation: Option[ConfigNodePropertyString],
                emailEnabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties] = deriveEncoder
}
