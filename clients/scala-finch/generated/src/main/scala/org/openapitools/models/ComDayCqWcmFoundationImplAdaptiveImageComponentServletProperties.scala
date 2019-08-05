package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param adaptPeriodsupportedPeriodwidths 
 */
case class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties(adaptPeriodsupportedPeriodwidths: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties] = deriveEncoder
}
