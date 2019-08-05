package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplGfxCommonsGfxRendererProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplGfxCommonsGfxRendererInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplGfxCommonsGfxRendererProperties]
                )

object ComDayCqDamCoreImplGfxCommonsGfxRendererInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplGfxCommonsGfxRendererInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplGfxCommonsGfxRendererInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplGfxCommonsGfxRendererInfo] = deriveEncoder
}
