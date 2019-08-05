package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplMissingMetadataNotificationJobProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplMissingMetadataNotificationJobInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplMissingMetadataNotificationJobProperties]
                )

object ComDayCqDamCoreImplMissingMetadataNotificationJobInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplMissingMetadataNotificationJobInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplMissingMetadataNotificationJobInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplMissingMetadataNotificationJobInfo] = deriveEncoder
}
