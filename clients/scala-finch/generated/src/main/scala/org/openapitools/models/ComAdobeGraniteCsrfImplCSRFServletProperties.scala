package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param csrfPeriodtokenPeriodexpiresPeriodin 
 * @param slingPeriodauthPeriodrequirements 
 */
case class ComAdobeGraniteCsrfImplCSRFServletProperties(csrfPeriodtokenPeriodexpiresPeriodin: Option[ConfigNodePropertyInteger],
                slingPeriodauthPeriodrequirements: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteCsrfImplCSRFServletProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteCsrfImplCSRFServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCsrfImplCSRFServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCsrfImplCSRFServletProperties] = deriveEncoder
}
