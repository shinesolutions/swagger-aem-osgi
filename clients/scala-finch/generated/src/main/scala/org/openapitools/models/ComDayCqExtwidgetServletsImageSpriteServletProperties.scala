package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param maxWidth 
 * @param maxHeight 
 */
case class ComDayCqExtwidgetServletsImageSpriteServletProperties(maxWidth: Option[ConfigNodePropertyInteger],
                maxHeight: Option[ConfigNodePropertyInteger]
                )

object ComDayCqExtwidgetServletsImageSpriteServletProperties {
    /**
     * Creates the codec for converting ComDayCqExtwidgetServletsImageSpriteServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqExtwidgetServletsImageSpriteServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqExtwidgetServletsImageSpriteServletProperties] = deriveEncoder
}
