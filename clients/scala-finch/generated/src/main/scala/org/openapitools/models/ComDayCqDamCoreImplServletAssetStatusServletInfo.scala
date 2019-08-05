package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplServletAssetStatusServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplServletAssetStatusServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplServletAssetStatusServletProperties]
                )

object ComDayCqDamCoreImplServletAssetStatusServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletAssetStatusServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletAssetStatusServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletAssetStatusServletInfo] = deriveEncoder
}
