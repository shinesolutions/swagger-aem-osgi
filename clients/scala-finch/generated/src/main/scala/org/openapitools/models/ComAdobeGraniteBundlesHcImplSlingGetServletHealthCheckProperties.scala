package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param hcPeriodtags 
 */
case class ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties] = deriveEncoder
}
