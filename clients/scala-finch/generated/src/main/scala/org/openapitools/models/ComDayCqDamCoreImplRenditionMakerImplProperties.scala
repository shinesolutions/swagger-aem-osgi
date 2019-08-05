package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param xmpPeriodpropagate 
 * @param xmpPeriodexcludes 
 */
case class ComDayCqDamCoreImplRenditionMakerImplProperties(xmpPeriodpropagate: Option[ConfigNodePropertyBoolean],
                xmpPeriodexcludes: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCoreImplRenditionMakerImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplRenditionMakerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplRenditionMakerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplRenditionMakerImplProperties] = deriveEncoder
}
