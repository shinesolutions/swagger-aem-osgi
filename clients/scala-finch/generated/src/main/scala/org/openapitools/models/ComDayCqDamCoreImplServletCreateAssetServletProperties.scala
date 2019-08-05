package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param detectUnderscoreduplicate 
 */
case class ComDayCqDamCoreImplServletCreateAssetServletProperties(detectUnderscoreduplicate: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplServletCreateAssetServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletCreateAssetServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletCreateAssetServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletCreateAssetServletProperties] = deriveEncoder
}
