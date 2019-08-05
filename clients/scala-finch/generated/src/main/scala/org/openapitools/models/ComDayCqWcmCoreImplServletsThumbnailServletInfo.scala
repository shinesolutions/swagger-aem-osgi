package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplServletsThumbnailServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplServletsThumbnailServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplServletsThumbnailServletProperties]
                )

object ComDayCqWcmCoreImplServletsThumbnailServletInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsThumbnailServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsThumbnailServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsThumbnailServletInfo] = deriveEncoder
}
