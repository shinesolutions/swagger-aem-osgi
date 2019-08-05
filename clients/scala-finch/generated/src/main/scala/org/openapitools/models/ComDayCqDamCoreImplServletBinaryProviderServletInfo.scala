package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplServletBinaryProviderServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplServletBinaryProviderServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplServletBinaryProviderServletProperties]
                )

object ComDayCqDamCoreImplServletBinaryProviderServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletBinaryProviderServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletBinaryProviderServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletBinaryProviderServletInfo] = deriveEncoder
}
