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
case class ComDayCqDamHandlerStandardPdfPdfHandlerProperties(rasterPeriodannotation: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamHandlerStandardPdfPdfHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamHandlerStandardPdfPdfHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamHandlerStandardPdfPdfHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamHandlerStandardPdfPdfHandlerProperties] = deriveEncoder
}
