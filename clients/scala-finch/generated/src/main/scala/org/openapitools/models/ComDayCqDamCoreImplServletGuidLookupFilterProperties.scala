package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPerioddamPeriodcorePeriodguidlookupfilterPeriodenabled 
 */
case class ComDayCqDamCoreImplServletGuidLookupFilterProperties(cqPerioddamPeriodcorePeriodguidlookupfilterPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplServletGuidLookupFilterProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletGuidLookupFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletGuidLookupFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletGuidLookupFilterProperties] = deriveEncoder
}
