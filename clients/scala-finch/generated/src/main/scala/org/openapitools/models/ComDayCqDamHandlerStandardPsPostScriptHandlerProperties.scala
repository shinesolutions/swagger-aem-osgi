package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param rasterPeriodannotation 
 */
case class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties(rasterPeriodannotation: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamHandlerStandardPsPostScriptHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamHandlerStandardPsPostScriptHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamHandlerStandardPsPostScriptHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamHandlerStandardPsPostScriptHandlerProperties] = deriveEncoder
}
