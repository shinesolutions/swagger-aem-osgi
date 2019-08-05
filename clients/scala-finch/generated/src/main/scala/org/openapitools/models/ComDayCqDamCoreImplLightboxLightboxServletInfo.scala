package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplLightboxLightboxServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplLightboxLightboxServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplLightboxLightboxServletProperties]
                )

object ComDayCqDamCoreImplLightboxLightboxServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplLightboxLightboxServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplLightboxLightboxServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplLightboxLightboxServletInfo] = deriveEncoder
}
