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
case class ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties] = deriveEncoder
}
