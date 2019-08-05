package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplServletCreateAssetServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplServletCreateAssetServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplServletCreateAssetServletProperties]
                )

object ComDayCqDamCoreImplServletCreateAssetServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletCreateAssetServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletCreateAssetServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletCreateAssetServletInfo] = deriveEncoder
}
