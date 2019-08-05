package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplServletCompanionServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplServletCompanionServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplServletCompanionServletProperties]
                )

object ComDayCqDamCoreImplServletCompanionServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletCompanionServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletCompanionServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletCompanionServletInfo] = deriveEncoder
}
