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
 * @param operationIcon 
 * @param topicName 
 * @param emailEnabled 
 */
case class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(operation: Option[ConfigNodePropertyString],
                operationIcon: Option[ConfigNodePropertyString],
                topicName: Option[ConfigNodePropertyString],
                emailEnabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties] = deriveEncoder
}
