package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplServletAssetXMPSearchServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplServletAssetXMPSearchServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplServletAssetXMPSearchServletProperties]
                )

object ComDayCqDamCoreImplServletAssetXMPSearchServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletAssetXMPSearchServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletAssetXMPSearchServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletAssetXMPSearchServletInfo] = deriveEncoder
}
