package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param skipPeriodbufferedcache 
 */
case class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties(skipPeriodbufferedcache: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplGfxCommonsGfxRendererProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplGfxCommonsGfxRendererProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplGfxCommonsGfxRendererProperties] = deriveEncoder
}
