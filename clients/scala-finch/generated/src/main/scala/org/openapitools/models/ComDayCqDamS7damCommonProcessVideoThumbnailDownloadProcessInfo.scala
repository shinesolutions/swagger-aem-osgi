package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties]
                )

object ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo] = deriveEncoder
}
