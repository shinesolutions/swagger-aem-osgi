package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodpostPeriodoperation 
 * @param slingPeriodservletPeriodmethods 
 */
case class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties(slingPeriodpostPeriodoperation: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodmethods: Option[ConfigNodePropertyString]
                )

object ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties] = deriveEncoder
}
