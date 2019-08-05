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
 * @param filterPeriodmethods 
 * @param filterPeriodenablePeriodsafePerioduserPeriodagents 
 * @param filterPeriodsafePerioduserPeriodagents 
 * @param filterPeriodexcludedPeriodpaths 
 */
case class ComAdobeGraniteCsrfImplCSRFFilterProperties(filterPeriodmethods: Option[ConfigNodePropertyArray],
                filterPeriodenablePeriodsafePerioduserPeriodagents: Option[ConfigNodePropertyBoolean],
                filterPeriodsafePerioduserPeriodagents: Option[ConfigNodePropertyArray],
                filterPeriodexcludedPeriodpaths: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteCsrfImplCSRFFilterProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteCsrfImplCSRFFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCsrfImplCSRFFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCsrfImplCSRFFilterProperties] = deriveEncoder
}
