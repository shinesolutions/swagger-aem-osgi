package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplServletsFindReplaceServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplServletsFindReplaceServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplServletsFindReplaceServletProperties]
                )

object ComDayCqWcmCoreImplServletsFindReplaceServletInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsFindReplaceServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsFindReplaceServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsFindReplaceServletInfo] = deriveEncoder
}
