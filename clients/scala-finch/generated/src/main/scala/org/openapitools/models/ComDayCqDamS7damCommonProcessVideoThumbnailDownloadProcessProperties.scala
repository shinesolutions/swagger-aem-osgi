package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param processPeriodlabel 
 */
case class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(processPeriodlabel: Option[ConfigNodePropertyString]
                )

object ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties] = deriveEncoder
}
