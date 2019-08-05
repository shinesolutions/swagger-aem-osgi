package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param changeeventlistenerPeriodobservedPeriodpaths 
 */
case class ComDayCqDamCoreImplDamChangeEventListenerProperties(changeeventlistenerPeriodobservedPeriodpaths: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCoreImplDamChangeEventListenerProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplDamChangeEventListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplDamChangeEventListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplDamChangeEventListenerProperties] = deriveEncoder
}
