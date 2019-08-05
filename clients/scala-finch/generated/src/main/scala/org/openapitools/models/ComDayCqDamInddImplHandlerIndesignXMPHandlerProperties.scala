package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param processPeriodlabel 
 * @param extractPeriodpages 
 */
case class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(processPeriodlabel: Option[ConfigNodePropertyString],
                extractPeriodpages: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties] = deriveEncoder
}
