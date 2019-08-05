package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties]
                )

object ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo] = deriveEncoder
}
